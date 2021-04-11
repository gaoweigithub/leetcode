package 数组.全排列;

import java.util.ArrayList;
import java.util.List;

public class 回溯法2 {


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
        boolean[] used = new boolean[nums.length];
        backTrack(result,tmp,nums,used);
        return result;
    }
    public void backTrack(List<List<Integer>> result, List<Integer> tmp, int[]nums,boolean[]used){
        if (tmp.size() == nums.length){
            result.add(new ArrayList<>(tmp));
            return;
        }
        for (int i=0;i<nums.length; i++) {
            int num = nums[i];
            if (!used[i]){
                tmp.add(num);
                used[i]=true;
                backTrack(result, tmp, nums,used);
                tmp.remove(tmp.size() - 1);
                used[i]=false;
            }
        }

    }
}
