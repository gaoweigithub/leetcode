package 玩转双指针;

import java.util.HashMap;
import java.util.Map;

public class 不重复的最长字串_2 {

    public static void main(String[] args) {
        不重复的最长字串_2 dd = new 不重复的最长字串_2();

        System.out.println(dd.lengthOfLongestSubstring("aab"));
    }

    public int lengthOfLongestSubstring(String s) {
        if (s == null){
            return 0;
        }
        if (s.length() < 2){
            return s.length();
        }

        char[]chars = s.toCharArray();
        int max = 0;
        int start = 0;
        int end =0;
        Map<Character,Integer> map = new HashMap<>();
        while (start <= end && end < chars.length){
            if (map.containsKey(chars[end])){
                start = max(start,map.get(chars[end]));
            }
            max = max(max,end-start + 1);
            map.put(chars[end],end + 1);
            end ++;
        }
        return max;
    }
    int max(int a,int b){
        return a>b ? a:b;
    }
}
