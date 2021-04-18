package 玩转双指针;

public class 验证回文字符窜 {

    public static void main(String[] args) {
        验证回文字符窜 dd = new 验证回文字符窜();

        System.out.println(dd.validPalindrome("abc"));
    }

    boolean use = false;

    public boolean validPalindrome(String s) {

        if (s == null || s.trim().equals("")){
            return false;
        }

        return validPalindrome(s.toCharArray(), 0, s.length() - 1);
    }

    public boolean validPalindrome(char[] chars, int start, int end) {

        if (end - start <= 1 && !use) {
            return true;
        }

        while (start <= end) {
            if (chars[start] == chars[end]) {
                start++;
                end--;
            } else if (!use){
                use = true;
                return validPalindrome(chars, start + 1, end) || validPalindrome(chars, start, end - 1);
            }else {
                return false;
            }
        }
        return true;
    }
}
