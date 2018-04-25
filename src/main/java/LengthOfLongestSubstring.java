/**
 * @(#)LengthOfLongestSubstring.java Created by gw33973 on 2018/4/25   23:01
 * <p>
 * Copyrights (C) 2018保留所有权利
 */

import javax.swing.*;

/**
 * (类型功能说明描述)
 *
 * <p>
 * 修改历史:                                 <br>
 * 修改日期           修改人员       版本       修改内容<br>
 * -------------------------------------------------<br>
 * 2018/4/25 23:01   gw33973     1.0       初始化创建<br>
 * </p>
 *
 * @author gw33973
 * @version 1.0
 * @since JDK1.7
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        if(chars.length == 0){
            return 0;
        }
        if (chars.length == 1) {
            return 1;
        }
        int maxlength = 1;
        int startcur = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = startcur; j < i; j++) {
                if (chars[j] == chars[i]) {
                    startcur = j + 1;
                    break;
                }
            }
            maxlength = Math.max(maxlength, i - startcur + 1);
        }
        return maxlength;
    }
}
