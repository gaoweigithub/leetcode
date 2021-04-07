package 数组.割绳子;

public class Solution动态规划 {

    public static void main(String[] args) {
        Solution动态规划 dd = new Solution动态规划();
        System.out.println(dd.cutRope(8));
    }

    /**
     * 1，最下子问题f(i) = max(f(i),f(i-j),f(j))
     * 2, i[0,target]  j[o,i]
     * 3,f(0) = f(1) = 1
     * @param target
     * @return
     */
    public int cutRope(int target) {
        int[] f = new int[target + 1];
        f[0] = 1;
        f[1] = 1;
        f[2] = 2;
        f[3] = 3;
        int max = 0;
        for (int i=4;i<= target;i++){

            max =0;
            for (int j=0;j<i;j++){
                int now = f[j] * f[i-j];
                if (now > max){
                    max=now;
                }
            }
            f[i] = max;
        }
        return max;
    }

}
