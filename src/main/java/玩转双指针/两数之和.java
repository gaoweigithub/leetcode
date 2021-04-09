package 玩转双指针;

import java.util.Arrays;

public class 两数之和 {

    public static void main(String[] args) {

        两数之和 dd = new 两数之和();
        Arrays.stream(dd.twoSum(new int[]{-3,3,4,90}, 0)).forEach(i -> System.out.print(i+" "));

    }

    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        if (numbers.length < 2){
            return result;
        }

        int start = 1;
        int end = numbers.length;
        while (start < end){
            int tmp = numbers[start-1] + numbers[end-1];
            if ( tmp == target){
                result[0] = start;
                result[1] = end;
                break;
            }else if(tmp < target){
                start++;
            }else{
                end--;
            }
        }
        return result;
    }
}
