/*
48. Rotate Image

You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

Follow up:
Could you do this in-place?
*/

public class Solution {
    public void rotate(int[][] matrix) {
        int[][] newMat = new int[matrix.length][matrix[0].length];
        int length = matrix.length;
        
        for(int i = 0; i < length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                newMat[i][j] = matrix[length - j - 1][i];
            }
        }
        
        for(int i = 0; i < length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = newMat[i][j];
            }
        }
    }
}