/**
 * @(#)LongestPalindrome.java Created by gw33973 on 2018/4/26   22:41
 * <p>
 * Copyrights (C) 2018保留所有权利
 */

import jdk.nashorn.internal.ir.ReturnNode;

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
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        if (chars.length <= 1) {
            return s;
        }
        if (chars.length == 2) {
            if (chars[0] == chars[1]) {
                return s;
            }
            return s.substring(0, 1);
        }
        int ms = 0;
        int me = 0;
        for (int i = 1; i < chars.length - 1; i++) {
            int min = Math.min(i + 1, chars.length - i);
            for (int j = 1; j < min; j++) {
                if (chars[i - j] != chars[i + j]) {
                    //not equal stop
                    if ((j - 1) * 2 + 1 > (me - ms + 1)) {
                        me = i + j - 1;
                        ms = i - j + 1;
                    }
                    break;
                }
                if (j == min - 1) {
                    if (j * 2 + 1 > (me - ms + 1)) {
                        me = i + j;
                        ms = i - j;
                    }
                }
            }
        }

        for (int i = 0; i < chars.length - 1; i++) {
            int min = Math.min(i + 1, chars.length - i);
            for (int j = 1; j < min; j++) {
                if (chars[i - j + 1] != chars[i + j]) {
                    //not equal stop
                    if ((j - 1) * 2 > (me - ms + 1)) {
                        me = i + j - 1;
                        ms = i - j + 2;
                    }
                    break;
                }
                if (j == min - 1) {
                    if (j * 2 > (me - ms + 1)) {
                        me = i + j;
                        ms = i - j + 1;
                    }
                }
            }
        }

        return s.substring(ms, me + 1);
    }
}
