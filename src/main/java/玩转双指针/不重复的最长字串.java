package 玩转双指针;

import java.util.HashSet;
import java.util.Set;

public class 不重复的最长字串 {

    public static void main(String[] args) {
        不重复的最长字串 dd = new 不重复的最长字串();

        System.out.println(dd.lengthOfLongestSubstring("aab"));
    }

    public int lengthOfLongestSubstring(String s) {
        if (s == null){
            return 0;
        }
        if (s.length() < 2){
            return s.length();
        }

        char[] chars = s.toCharArray();
        int start =0;
        int end = 1;
        int max = 0;
        Set<Character> set = new HashSet<>(s.length());
        set.add(chars[0]);
        while (end >= start && end < chars.length){
            if (!set.contains(chars[end])){
                set.add(chars[end++]);
            }else{
                max = max > set.size() ? max : set.size();
                boolean find = false;
                while (start < end && !find){
                    if (chars[start] == chars[end]){
                        find = true;
                    }
                    set.remove(chars[start++]);
                }
            }
        }
        return max > set.size() ? max : set.size();
    }
}
