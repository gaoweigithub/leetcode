package 数组.矩阵;

public class 机器人遍历问题 {

    public static void main(String[] args) {
        机器人遍历问题 dd = new 机器人遍历问题();

//        int ss = dd.movingCount(15,20 ,20 );
//        System.out.println(ss);

        System.out.println(dd.sum(11,12));
    }

    int count = 0;
    public int movingCount(int threshold, int rows, int cols) {

        boolean[] visted = new boolean[rows * cols];
        movingCount(threshold,rows,cols,0,0,visted);
        return count;
    }
    void movingCount(int threadHold, int rows, int cols, int r, int c, boolean[] visted){
        int now = r * cols + c;
        if (r < 0 || c < 0 || r > rows - 1 || c > cols - 1 || visted[now] || sum(r,c) > threadHold ){
            return;
        }

        visted[now] = true;
        count ++;
        movingCount(threadHold, rows, cols, r,c- 1, visted);
        movingCount(threadHold, rows, cols, r,c+1, visted);
        movingCount(threadHold, rows, cols, r-1,c, visted);
        movingCount(threadHold, rows, cols, r+ 1,c, visted);
    }

    int sum(int row , int col){
        int sum = 0;
        while (row > 0){
            sum += row % 10;
            row = row/ 10;
        }
        while (col > 0){
            sum += col % 10;
            col = col / 10;
        }
        return sum;
    }

}
