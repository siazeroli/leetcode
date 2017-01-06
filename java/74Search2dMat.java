/*
74. Search a 2D Matrix

Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
For example,

Consider the following matrix:

[
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]

Given target = 3, return true.
*/

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix == null){
            return false;
        }
        
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i].length == 0){
                continue;
            }
            if(target >= matrix[i][0] && target <= matrix[i][matrix[i].length-1]){
                for(int j = 0; j < matrix[i].length; j++){
                    if(target == matrix[i][j]){
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
}