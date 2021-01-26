package 位运算;

public class Test移位 {

    public static void main(String[] args) {
//        int m = 1;
//        while (m > 0){
//            System.out.println(m);
//            m = m<<1;
//        }
//        System.out.println(Integer.toBinaryString(-9));
//        System.out.println(Solution.NumberOf1(-9));

//        System.out.println(2>>1);
//        System.out.println(2>>>1);


        int count = 0;
        int n =Integer.MAX_VALUE;
        while(n != 0){
            count += (n & 1); //每次判断最低位是否为1
            System.out.println(Integer.toBinaryString(n));
            n >>>= 1;
        }

    }

    public static class Solution {
        public static int NumberOf1(int n) {
            String s=Integer.toBinaryString(n);
            String[] split=s.split("");
            int a=0;
            for(int i = 0; i < split.length; i++) {
                if (split[i].equals("1"))
                {
                    a++;
                }
            }
            return a;
        }
    }
}
