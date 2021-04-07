package 贪心;

public class 发糖 {

    public static void main(String[] args) {
        发糖 ff = new 发糖();

        System.out.println(ff.candy(new int[]{1,0,2}));
        System.out.println(ff.candy(new int[]{1,2,2}));
    }

    public int candy(int[] ratings) {

        if (ratings.length < 2){
            return ratings.length;
        }

        int[]nums = new int[ratings.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = 1;
        }

        for (int i = 0; i < ratings.length - 1; i++) {
            if (ratings[i+1] > ratings[i]){
                nums[i+1] = nums[i] + 1;
            }
        }
        for (int i = ratings.length - 1; i >= 1; i--) {
            if (ratings[i-1] > ratings[i]){
                nums[i-1] = max(nums[i]+1,nums[i-1]);
            }
        }
        int counter = 0;
        for (int num : nums) {
            counter += num;
        }
        return counter;
    }
    int max(int a, int b){
        return a>b?a : b;
    }
}
