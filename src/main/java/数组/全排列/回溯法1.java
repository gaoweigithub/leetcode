package 数组.全排列;

import java.util.ArrayList;
import java.util.List;

public class 回溯法1 {


    /*
    result = []
    def backtrack(路径, 选择列表):
    if 满足结束条件:
        result.add(路径)
        return

    for 选择 in 选择列表:
        做选择
        backtrack(路径, 选择列表)
        撤销选择
     */

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        backTrack(result,tmp,nums);
        return result;
    }
    public void backTrack(List<List<Integer>> result, List<Integer> tmp, int[]nums){
        if (tmp.size() == nums.length){
            result.add(new ArrayList<>(tmp));
            return;
        }
        for (int num : nums) {
            if (!tmp.contains(num)){
                tmp.add(num);
                backTrack(result, tmp, nums);
                tmp.remove(tmp.size() - 1);
            }
        }

    }
}
