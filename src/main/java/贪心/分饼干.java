package 贪心;

import java.util.Arrays;

public class 分饼干 {

    public static void main(String[] args) {

        分饼干 ss = new 分饼干();

        System.out.println(ss.findContentChildren(new int[]{1,2,3},new int[]{1,1} ));
        System.out.println(ss.findContentChildren(new int[]{1,2},new int[]{1,2,3} ));

    }

    /**
     *
     * @param g 孩子的饥饿度
     * @param s 小饼干尺寸
     * @return
     */
    public int findContentChildren(int[] g, int[] s) {
        if (g.length < 1 || s.length < 1){
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);
        int counter = 0;
        int gp = 0;
        int sp = 0;
        while (gp < g.length && sp < s.length){
            if (g[gp] <= s[sp]){
                counter ++;
                gp++;
                sp++;
            }else if (g[gp] > s[sp]){
                sp++;
            }
        }
        return counter;
    }

}
