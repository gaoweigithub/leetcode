package 玩转双指针;

public class 找出连续的最长数字字符串 {

    public static void main(String[] args) {
        找出连续的最长数字字符串 dd = new 找出连续的最长数字字符串();
        System.out.println(dd.maxSubNumStr("abcd123.4567.890.123"));
    }

    private String maxSubNumStr(String input){
        if (input == null || input.length() == 0){
            return "";
        }
        char[] chars = input.toCharArray();
        int l=0,r=0;
        int max=0,tmpl=-1,tmpr=-1;
        while (l<=r && r < chars.length){
            if ( !isNumChar(chars[l]) && !isDot(chars[l])){
                l++;
                if (r<l){
                    r=l;
                }
            }else if (isNumChar(chars[r]) || isDot(chars[r])){
                r++;
            }else if (r-l >= max){
                max = r-l;
                tmpl = l;
                tmpr = r-1;
                l=r;
            }
        }
        if (tmpl > -1){
            int j=0;
            char[] newchar= new char[tmpr-tmpl+1];
            for (int i=tmpl;i<=tmpr;i++){
                newchar[j++] = chars[i];
            }
            return new String(newchar);
        }
        return "";
    }

    boolean isNumChar(char ch){
        return ch >= '0' && ch <= '9';
    }
    boolean isDot(char ch){
        return '.' == ch;
    }
}
