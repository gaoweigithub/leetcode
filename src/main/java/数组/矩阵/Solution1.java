package 数组.矩阵;

public class Solution1 {

    public static void main(String[] args) {
        Solution1 ss1 = new Solution1();

        System.out.println( ss1.hasPath("ABCEHJIGSFCSLOPQADEEMNOEADIDEJFMVCEIFGGS", 3, 4, "ABCCED"));
    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param matrix string字符串
     * @param rows int整型
     * @param cols int整型
     * @param str string字符串
     * @return bool布尔型
     */
    public boolean hasPath (String matrix, int rows, int cols, String str) {
        // write code here

        if (matrix == null || matrix.length() == 0 || rows < 1 || cols < 1 || str == null || str.length() == 0){
            return false;
        }

        char[] mc = matrix.toCharArray();
        char[] sc = str.toCharArray();
        byte[] flag = new byte[cols * rows];

        for (int i=0;i<mc.length;i++){
            if (mc[i] == sc[0]){
                flag[i] = 1;
                boolean find = find(mc,sc,1, flag,i,rows,cols);
                if (find){
                    return true;
                }
                flag[i] = 0;
            }
        }
        return false;
    }
    boolean find(char[]mc,char[] sc,int tci,byte[]flag,int pre,int rows,int cols){

        if (tci == sc.length){
            return true;
        }

        int row = pre / cols;
        int col = pre % cols;
        //4个方向
        int left = pre - 1;
        int right = pre + 1;
        int top = pre - cols;
        int bottom = pre + cols;

        boolean findLeft = false;
        if (col >0 && flag[left] ==0 && mc[left] == sc[tci]){
            flag[left] = 1;
            findLeft = find(mc, sc, tci+1, flag, left, rows, cols);
            if (!findLeft){
                flag[left] = 0;
            }
        }
        if (findLeft){
            return true;
        }

        boolean findRight = false;
        if (col < cols - 1 && flag[right] ==0 && mc[right] == sc[tci] ){
            flag[right] = 1;
            findRight = find(mc, sc, tci+1, flag, right, rows, cols);
            if (!findRight){
                flag[right] = 0;
            }
        }

        if (findRight){
            return true;
        }

        boolean findTop = false;
        if (row > 0 && flag[top] ==0 && mc[top] == sc[tci] ){
            flag[top] = 1;
            findTop = find(mc, sc, tci+1, flag, top, rows, cols);
            if (!findTop){
                flag[top] = 0;
            }
        }

        if (findTop){
            return true;
        }

        boolean findBottom = false;
        if (row < rows - 1 && flag[bottom] ==0 && mc[bottom] == sc[tci] ){
            flag[bottom] = 1;
            findBottom = find(mc, sc, tci+1, flag, bottom, rows, cols);
            if (!findBottom){
                flag[bottom] = 0;
            }
        }
        if (findBottom){
            return true;
        }
        return false;
    }
}
