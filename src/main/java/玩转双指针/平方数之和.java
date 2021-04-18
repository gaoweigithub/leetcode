package 玩转双指针;

public class 平方数之和 {

    public static void main(String[] args) {
        平方数之和 dd = new 平方数之和();
        System.out.println(dd.judgeSquareSum(1000000));
    }

    public boolean judgeSquareSum(int c) {

        if (c < 0){
            return false;
        }

        int start = 0;
        int end = (int) Math.sqrt(c);
        while (start <= end){
            long tmp = start * start + end * end;
            if (tmp == c){
                System.out.println(start + "," + end);
                return true;
            }else if (tmp < c){
                start ++;
            }else{
                end --;
            }
        }

        return false;

    }
}
