public class ZTransform {
    public static void main(String[] args) {
        String rr = "LEETCODEISHIRING";
        System.out.println(convert(rr, 3));
        System.out.println(convert(rr, 4));
        System.out.println(convert("ABC", 2));
    }

    public static String convert(String s, int numRows) {
        if (s == null || s.trim() == null || numRows < 2) {
            return s;
        }
        char[] chars = s.toCharArray();
        if (chars.length <= numRows) {
            return s;
        }
        int cols = chars.length - numRows + 1;
        char[][] rr = new char[numRows][cols];

        boolean down = true;
        int counter = 0;
        int x = 0;
        int y = 0;
        for (char c : chars) {
            if (down) {
                y = counter;
            } else {
                x++;
                y = numRows - counter - 1;
            }

            rr[y][x] = c;

            if (counter == numRows - 1) {
                counter = 1;
                down = !down;
            } else {
                counter++;
            }
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= x; j++) {
//                System.out.print(rr[i][j] + "\t");
                if (rr[i][j] != 0) {
                    sb.append(rr[i][j]);
                }
            }
//            System.out.println("\n");
        }
        return sb.toString();
    }
}
