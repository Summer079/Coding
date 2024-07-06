package Matrix;

import java.util.*;

class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return res;
        }
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;
        
        while (top <= bottom && left <= right) {
            // Traverse from left to right along the top row
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            top++;
            
            // Traverse from top to bottom along the right column
            for (int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            right--;
            
            if (top <= bottom) {
                // Traverse from right to left along the bottom row
                for (int i = right; i >= left; i--) {
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            if (left <= right) {
                // Traverse from bottom to top along the left column
                for (int i = bottom; i >= top; i--) {
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        
        return res;
    }
    
    public static void main(String[] args) {
    	SpiralMatrix solution = new SpiralMatrix();
        
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> result1 = solution.spiralOrder(matrix1);
        System.out.println("Input: matrix =" + "\n[[1,2,3]," + "\n [4,5,6]," + "\n [7,8,9]]");
        System.out.println("\nOutput: " + result1);
        
        System.out.println();
        
        int[][] matrix2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        List<Integer> result2 = solution.spiralOrder(matrix2);
        System.out.println("Input: matrix = \n[[1, 2, 3, 4], \n [5, 6, 7, 8], \n [9,10,11,12]]");
        System.out.println("\nOutput: " + result2);
    }
}
