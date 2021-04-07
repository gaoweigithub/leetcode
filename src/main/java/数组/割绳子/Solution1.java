package 数组.割绳子;

public class Solution1 {

    public static void main(String[] args) {
        Solution1 dd = new Solution1();
        System.out.println(dd.cutRope(8));
    }

    public int cutRope(int target) {
        if (target < 5){
            return target;
        }
        int mul = 1;
        while (target > 4){
            mul *= 3;
            target -= 3;
        }
        mul *= cutRope(target);
        return mul;
    }

}
