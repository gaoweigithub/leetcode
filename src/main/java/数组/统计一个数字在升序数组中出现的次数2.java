package 数组;

public class 统计一个数字在升序数组中出现的次数2 {

    public static void main(String[] args) {
        int[] arr = new int[]{4,5};

        System.out.println(binarySearch(arr,2.5) - binarySearch(arr,1.5));
    }
    static int binarySearch(int [] arr,double k){
        int s =0, e = arr.length -1;
        while (e >= s){
            int mid = (s+e) / 2;
            if (arr[mid] > k){
                e = mid - 1;
            }else if(arr[mid]<k){
                s = mid + 1;
            }
        }
        return s;
    }
}
