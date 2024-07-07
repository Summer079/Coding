/**
 * 
 * Rotate Matrix
 * 
 * Given a square n x n matrix of integers matrix, rotate it by 90 degrees clockwise.
 * 
 * You must rotate the matrix in-place. Do not allocate another 2D matrix and do the rotation.
 * 
 * 
 * Example 1:
 * 
 * Input: matrix = [
 *  [1,2,3],
 *  [4,5,6],
 *  [7,8,9]
 * ]
 * 
 * Output: [
 *  [7,4,1],
 *  [8,5,2],
 *  [9,6,3]
 * ]
 * 
 */

package Matrix;

import java.util.*;

class RotateImage {
    static void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
    }

    public static void main(String args[]) {
        int arr[][] =  {
        		{1, 2, 3}, 
        		{4, 5, 6}, 
        		{7, 8, 9}};
        rotate(arr);
        System.out.println("Rotated Image");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}

