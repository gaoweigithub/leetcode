package 二分查找;

public class 在排序数组中查找元素的第一个和最后一个位置 {

    public static void main(String[] args) {

        在排序数组中查找元素的第一个和最后一个位置 dd = new 在排序数组中查找元素的第一个和最后一个位置();

        for (int i : dd.searchRange(new int[]{5,7,7,8,8,10}, 7)) {
            System.out.println(i);
        }

    }

    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length <= 0){
            return new int[]{-1,-1};
        }
        int l=0;
        int r=nums.length - 1;
        int mid ;
        while (l<=r){
            mid = l+(r-l)/2;
            if (nums[mid] == target){
                int li=mid;
                int ri=mid;
                while (li >= l && nums[li] == target){
                    li--;
                }
                while (ri<= r && nums[ri] == target){
                    ri++;
                }
                return new int[]{li+1,ri-1};
            }else if (nums[mid] >target){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}
