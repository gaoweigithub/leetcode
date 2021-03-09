package 动态规划;

import java.util.*;

public class Solution {
    public ArrayList<String> Permutation(String str) {

        if (str == null || str.trim().length() == 0){
            return null;
        }

        char[] chars = str.toCharArray();
        Set<String> asbs = new HashSet<>();

        for (Character character : chars) {
            if (asbs.isEmpty()){
                asbs.add(String.valueOf(character));
            }else{
                Set<String> tmp = new HashSet<>();
                for (String asb : asbs) {
                    for(int j = 0; j< asb.length();j++){
                        tmp.add(new StringBuffer(asb).insert(j,character).toString());
                    }
                    tmp.add(new StringBuffer(asb).append(character).toString());
                }
                asbs = tmp;
            }
        }
        ArrayList<String> result = new ArrayList<>();
        for (String asb : asbs) {
            result.add(asb);
        }
        result.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        return result;
    }
}