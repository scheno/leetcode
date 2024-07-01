package com.schening.leetcode.array.matrix;

/**
 * 59. 螺旋矩阵 II
 *
 * @author schen
 * @since 2024-07-01 22:19
 */
public class SpiralMatrixII {

    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int up = 0, down = n - 1, left = 0, right = n - 1, index = 1;
        while(index <= n * n){
            for(int i = left; i <= right; i++){
                res[up][i] = index++;
            }
            up++;
            for(int i = up; i <= down; i++){
                res[i][right] = index++;
            }
            right--;
            for(int i = right; i >= left; i--){
                res[down][i] = index++;
            }
            down--;
            for(int i = down; i >= up; i--){
                res[i][left] = index++;
            }
            left++;
        }
        return res;
    }

    public static void main(String[] args) {
        SpiralMatrixII spiralMatrixII = new SpiralMatrixII();
        int[][] matrix = spiralMatrixII.generateMatrix(3);
        System.out.println(matrix);
    }

}
