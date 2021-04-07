package 数组;

public class 统计一个数字在升序数组中出现的次数 {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2};

        System.out.println(GetNumberOfK(arr,2));
    }

    public static int GetNumberOfK(int [] array , int k) {
        if (array == null || array.length == 0){
            return 0;
        }

        int start = 0;
        int end = array.length - 1;
        int mid = 0;
        int counter = 0;
        while (end >= start){
            mid = (end + start) / 2;
            if (array[mid]  == k || mid == start || mid == end){
                //前后试探
                while (mid >= start && array[mid] == k){
                    mid --;
                }
                mid++;
                while (mid <= end){
                    if (array[mid++] == k){
                        counter ++;
                    }else {
                        break;
                    }
                }
                return counter;
            }else if (array[mid] < k){
                start = mid;
            }else{
                end = mid;
            }
        }

        return 0;
    }
}
