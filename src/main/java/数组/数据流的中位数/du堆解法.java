package 数组.数据流的中位数;

import java.util.Comparator;
import java.util.PriorityQueue;

public class du堆解法 {

    public static void main(String[] args) {
        du堆解法 ddd = new du堆解法();
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

    PriorityQueue<Integer> minQueue = new PriorityQueue<>(Integer::compareTo);
    PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Comparator.reverseOrder());

    public void Insert(Integer num) {
        if (maxQueue.isEmpty() || num <= maxQueue.peek()){
            maxQueue.offer(num);
        }else{
            minQueue.offer(num);
        }
        if (minQueue.size() + 2 == maxQueue.size()){
            minQueue.offer(maxQueue.poll());
        }else if (maxQueue.size() + 2 == minQueue.size()){
            maxQueue.offer(minQueue.poll());
        }
    }

    public Double GetMedian() {
        int maxZ = maxQueue.size();
        int minZ = minQueue.size();
        if (maxZ == minZ){
            return (minQueue.peek() + maxQueue.peek()) / 2.0;
        }else if (minZ > maxZ){
            return minQueue.peek() * 1.0;
        }else{
            return maxQueue.peek() * 1.0;
        }
    }

}
