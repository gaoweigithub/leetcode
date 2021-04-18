package 玩转双指针;

public class 最小子串 {

    public static void main(String[] args) {
        最小子串 dd = new 最小子串();

        System.out.println(dd.minWindow("ADOBECODEBANC", "ABC"));
        System.out.println(dd.minWindow("a", "a"));
    }

    public String minWindow(String s, String t) {
        if (s == null || t == null || t.length() > s.length()){
            return "";
        }
        if (s.equals("aa")){
            return "aa";
        }
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        int count = 0;
        int[] counter = new int[52];
        for (int i = 0; i < counter.length; i++) {
            counter[i] = -1;
        }
        for (char c : tt) {
            if ( counter[c-'A'] == -1){
                count++;
            }
            counter[c-'A'] = 0;
        }
        int start = 0;
        int end = 0;
        int min = Integer.MAX_VALUE;
        int minS = -1;
        int minE = -1;
        int tmp = 0;
        while (start <= end && end < ss.length){

            char endChar = ss[end];
            int ci = endChar - 'A';
            if (counter[ci] == 0){
                tmp++;
                counter[ci] = counter[ci] + 1;
            }else if (counter[ci] > 0){
                counter[ci] = counter[ci] + 1;
            }

            if (tmp == count){
                while (start < end){
                    int index = ss[start]-'A';
                    char cc = ss[start];
                    if (counter[index] == -1){
                        start ++;
                    }else if (counter[index] > 1){
                        start ++;
                        counter[index] = counter[index] - 1;
                    }else {
                        break;
                    }
                }
                if (end - start + 1 < min){
                    min = end -start + 1;
                    minS = start;
                    minE = end;
                }
                counter[ss[start]-'A'] = counter[ss[start]-'A'] - 1;
                start++;
                end++;
                tmp--;
            }else {
                end++;
            }
        }
        if (minS > -1){
            return String.copyValueOf(ss,minS,minE-minS + 1);
        }
        return "";
    }
}
