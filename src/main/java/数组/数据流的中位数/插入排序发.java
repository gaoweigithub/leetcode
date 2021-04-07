package 数组.数据流的中位数;

import java.util.Comparator;
import java.util.PriorityQueue;

public class 插入排序发 {

    public static void main(String[] args) {
        插入排序发 ddd = new 插入排序发();
        ddd.Insert(2);
        System.out.println(ddd.GetMedian());
        ddd.Insert(3);
        System.out.println(ddd.GetMedian());
        ddd.Insert(8);
        System.out.println(ddd.GetMedian());
        ddd.Insert(6);
        System.out.println(ddd.GetMedian());
        ddd.Insert(1);
        System.out.println(ddd.GetMedian());
        ddd.Insert(5);
        System.out.println(ddd.GetMedian());
        ddd.Insert(7);
        System.out.println(ddd.GetMedian());
        ddd.Insert(3);
        System.out.println(ddd.GetMedian());
        ddd.Insert(9);
        System.out.println(ddd.GetMedian());

    }

    int[] arr = new int[100];
    int index = -1;

    public void Insert(Integer num) {
        if (index == -1) {
            arr[++index] = num;
        } else {
            int i = 0;
            while (num >= arr[i] && i <= index) {
                i++;
            }

            index++;

            int tmp = arr[i];
            arr[i++] = num;
            int k ;
            while (i <= index) {

                k = arr[i];
                arr[i++] = tmp;
                tmp = k;
            }

        }
    }

    public Double GetMedian() {
        if (index % 2 == 0) {
            return arr[index / 2] * 1.0;
        }
        return (arr[index / 2] + arr[index / 2 + 1]) / 2.0;
    }

}
