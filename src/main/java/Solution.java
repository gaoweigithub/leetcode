/**
 * @(#)Solution.java Created by gw33973 on 2018/4/25   21:02
 * <p>
 * Copyrights (C) 2018保留所有权利
 */

/**
 * (类型功能说明描述)
 *
 * <p>
 * 修改历史:                                 <br>
 * 修改日期           修改人员       版本       修改内容<br>
 * -------------------------------------------------<br>
 * 2018/4/25 21:02   gw33973     1.0       初始化创建<br>
 * </p>
 *
 * @author gw33973
 * @version 1.0
 * @since JDK1.7
 */
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        if (nums.length < 2) {
            return null;
        }
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] rr = twoSum(new int[]{1, 2, 3, 4, 5, 6, 7}, 7);
        System.out.println(String.valueOf(rr[0]) + " and " + String.valueOf(rr[1]));
    }
}
