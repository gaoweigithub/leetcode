package 字符串;

import java.util.HashMap;
import java.util.Map;

public class 第一个只出现一次的字符 {

    public static void main(String[] args) {
        System.out.println('b' - 'a');
    }

    public int FirstNotRepeatingChar(String str) {
        Map<Character,Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (!map.containsKey(c)){
                map.put(c,0);
            }
            map.put(c,map.get(c) + 1);
        }

        for (int i = 0; i < chars.length; i++) {
            if (map.get(chars[i]) == 1){
                return i;
            }
        }
        return -1;
    }
}
