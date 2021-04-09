package 玩转双指针;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class 滑动窗口最大值 {


    public static void main(String[] args) {
        滑动窗口最大值 dd = new 滑动窗口最大值();

        System.out.println(dd.maxInWindows(new int[]{2,3,4,2,6,2,5,1}, 3));
    }

    PriorityQueue<Integer> queue= new PriorityQueue<>((o1, o2) -> o2.compareTo(o1));

    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> list = new ArrayList<>();
        if(num.length == 0 || num.length < size || size <= 0){
            return list;
        }
        int i=0;
        for (;i<size;i++){
            queue.add(num[i]);
        }
        list.add(queue.peek());
        for (;i<num.length;i++){
            queue.remove(num[i-size]);
            queue.offer(num[i]);
            list.add(queue.peek());
        }
        return list;
    }
}
