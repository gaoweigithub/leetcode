package 数组;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class 拼接最小数 {
    public static void main(String[] args) {

    }

    public String PrintMinNumber(int [] numbers) {
        List<Integer> arr = new ArrayList<>();
        for (int number : numbers) {
            arr.add(number);
        }
        arr.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (o1 +"" + o2).compareTo(o2+""+o1);
            }
        });
        StringBuffer stringBuffer = new StringBuffer();
        for (Integer integer : arr) {
            stringBuffer.append(integer);
        }
        return stringBuffer.toString();
    }
}
