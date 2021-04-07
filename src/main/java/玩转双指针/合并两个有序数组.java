package 滑动窗口;

import java.util.Arrays;

public class 合并两个有序数组 {

    public static void main(String[] args) {
        合并两个有序数组 dd = new 合并两个有序数组();

//        int[] aa = new int[]{1,2,3,0,0,0};
//        dd.merge(aa, 3,new int[]{2,5,6}, 3);

        int[] aa = new int[]{1};
        dd.merge(aa, 1,new int[]{}, 0);
        Arrays.stream(aa).forEach(i->System.out.println(i + ","));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p = m + n - 1 ;

        int s1 = m-1;
        int s2 = n-1;

        while (s1 >=0 || s2 >= 0){
            if (s1==-1){
                nums1[p--] = nums2[s2--];
            }else if (s2 == - 1){
                nums1[p--] = nums1[s1--];
            }else if (nums1[s1] >= nums2[s2]){
                nums1[p--] = nums1[s1--];
            }else {
                nums1[p--] = nums2[s2--];
            }
        }
    }
}
