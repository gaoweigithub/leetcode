package 二分查找;

public class 搜索旋转数组 {

    public static void main(String[] args) {
        搜索旋转数组 dd = new 搜索旋转数组();

        System.out.println(dd.search(new int[]{2,5,6,0,0,1,2}, 6));

    }

    public boolean search(int[] nums, int target) {
        if (nums.length == 0){
            return false;
        }
        int start = 0;
        int end = nums.length - 1;
        int mid=-1;
        while (start <= end){
            mid = start + (end - start) / 2;
            if (nums[mid] == target){
                return true;
            }
            if (nums[mid] == nums[start]){
                start++;
            }else if (nums[mid] <= nums[end]){
                if (target > nums[mid] && target <= nums[end]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else{
                if (target >= nums[start] && target < nums[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return false;
    }
}
