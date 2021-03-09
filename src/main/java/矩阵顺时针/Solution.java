package 矩阵顺时针;

import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {

        int[][] matrix = new int[5][1];
        matrix[0][0] = 0;
        matrix[1][0] = 1;
        matrix[2][0] = 2;
        matrix[3][0] = 3;
        matrix[4][0] = 4;

        System.out.println(printMatrix(matrix));

    }

    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        int xMin = 0;
        int yMin = xMin;
        int xMax = matrix.length - 1;
        int yMax = matrix[0].length - 1;
        int direct = 1;
        int maxCount = matrix.length * matrix[0].length;
        ArrayList<Integer> list = new ArrayList();

        int counter = 0;
        int xStart = 0;
        int yStart = 0;
        while (counter < maxCount) {
            if (direct == 1) {
                for (int i = yMin; i <= yMax; i++) {
                    list.add(matrix[xStart][i]);
                    counter++;
                }
                direct = 2;
                yStart = yMax;
                xMin = xMin + 1;
            } else if (direct == 2) {
                for (int i = xMin; i <= xMax; i++) {
                    list.add(matrix[i][yStart]);
                    counter++;
                }
                direct = 3;
                xStart = xMax;
                yMax = yMax - 1;
            } else if (direct == 3) {
                for (int i = yMax; i >= yMin; i--) {
                    list.add(matrix[xStart][i]);
                    counter++;
                }
                direct = 4;
                yStart = yMin;
                xMax = xMax - 1;
            } else if (direct == 4) {
                for (int i = xMax; i >= xMin; i--) {
                    list.add(matrix[i][yStart]);
                    counter++;
                }
                direct = 1;
                xStart = xMin;
                yMin = yMin + 1;
            }
        }
        return list;
    }
}