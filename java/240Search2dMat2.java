/*
240. Search a 2D Matrix II

Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.
For example,

Consider the following matrix:

[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]

Given target = 5, return true.

Given target = 20, return false.
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