package 二分查找;

public class 旋转数组最小值 {

    public static void main(String[] args) {
        旋转数组最小值 dd = new 旋转数组最小值();

        System.out.println(dd.findMin(new int[]{2,2,2,0,1}));

    }

    public int findMin(int[] nums) {

        int start = 0;
        int end = nums.length - 1;
        int mid = -1;

        while (start < end){
            mid = start + (end - start) / 2;
            if (nums[mid] > nums[end]){
                start = mid + 1;
            }else if (nums[mid] < nums[end]){
                end = mid;
            }else {
                end --;
            }
        }
        return nums[start];
    }
}
