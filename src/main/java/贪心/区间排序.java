package 贪心;

import java.util.Arrays;
import java.util.Comparator;

public class 区间排序 {

    public static void main(String[] args) {
        区间排序 dd = new 区间排序();
        System.out.println(dd.eraseOverlapIntervals(new int[][]{
                new int[]{1,2},
                new int[]{2,3},
                new int[]{3,4},
                new int[]{1,3}
        }));
    }

    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length < 1){
            return 0;
        }
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[1]));
        int count = 1;
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < end){
                continue;
            }
            end = intervals[i][1];
            count++;
        }
        return intervals.length - count;
    }
}
