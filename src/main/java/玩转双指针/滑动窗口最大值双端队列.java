package 玩转双指针;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class 滑动窗口最大值双端队列 {


    public static void main(String[] args) {
        滑动窗口最大值双端队列 dd = new 滑动窗口最大值双端队列();

        System.out.println(dd.maxInWindows(new int[]{2,3,4,2,6,2,5,1}, 3));
    }

    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> list = new ArrayList<>();
        if(num.length == 0 || num.length < size || size <= 0){
            return list;
        }
        LinkedList<Integer> dQueque = new LinkedList<>();
        int i=0;
        for (;i<size-1;i++){
            while (!dQueque.isEmpty() && num[i] >= num[dQueque.getLast()]){
                dQueque.removeLast();
            }
            dQueque.addLast(i);
        }

        for (;i<num.length;i++){
            while (!dQueque.isEmpty() && num[i] >= num[dQueque.getLast()]){
                dQueque.removeLast();
            }
            dQueque.addLast(i);
            if (dQueque.peekFirst() == i - size){
                dQueque.removeFirst();
            }
            list.add(num[dQueque.peekFirst()]);
        }
        return list;
    }
}
