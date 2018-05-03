/**
 * @(#)LongestPalindrome.java Created by gw33973 on 2018/4/26   22:41
 * <p>
 * Copyrights (C) 2018保留所有权利
 */

import com.sun.deploy.util.StringUtils;
import jdk.nashorn.internal.ir.ReturnNode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * (类型功能说明描述)
 *
 * <p>
 * 修改历史:                                 <br>
 * 修改日期           修改人员       版本       修改内容<br>
 * -------------------------------------------------<br>
 * 2018/4/26 22:41   gw33973     1.0       初始化创建<br>
 * </p>
 *
 * @author gw33973
 * @version 1.0
 * @since JDK1.7
 */
public class LongestPalindrome {
    /*
    给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为1000。
     */
    public String longestPalindrome(String s) {
        if (s == null || s.trim().isEmpty()){
            return s;
        }

        //动态规划算法
        char[] chars = s.toCharArray();
        int n = chars.length;
        int start = 0;
        int maxlength = 1;
        boolean[][] dp = new boolean[n][n];
        //fill false
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                dp[i][j] = false;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (i - j < 2) {
                    dp[j][i] = (chars[i] == chars[j]);
                } else {
                    dp[j][i] = dp[j + 1][i - 1] && chars[i] == chars[j];
                }

                if (dp[j][i] && maxlength < (i - j + 1)) {
                    maxlength = i - j + 1;
                    start = j;
                }
            }
        }
        return s.substring(start,start + maxlength );

    }
}
