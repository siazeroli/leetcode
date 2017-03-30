/*
54. Spiral Matrix

Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

For example,
Given the following matrix:

[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
You should return [1,2,3,6,9,8,7,4,5].
*/

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> spMat = new ArrayList<Integer>();
        
        if(matrix.length == 0){
            return spMat;
        }
        
        int row = 0;
        int col = matrix[0].length - 1;
        int total = matrix.length * matrix[0].length;
        
        while(total > 0){
            for(int j = matrix[0].length - 1 - col; j <= col; j++){
                spMat.add(matrix[row][j]);
                total--;
            }
            if(total == 0) break;
            
            for(int i = row+1; i <= matrix.length - 1 - row; i++){
                spMat.add(matrix[i][col]);
                total--;
            }
            if(total == 0) break;
            
            for(int j = col-1; j >= matrix[0].length - 1 - col; j--){
                spMat.add(matrix[matrix.length - 1 - row][j]);
                total--;
            }
            if(total == 0) break;
            
            for(int i = matrix.length - 1 - row-1; i > row; i--){
                spMat.add(matrix[i][matrix[0].length - 1 - col]);
                total--;
            }
            
            row++;
            col--;
        }
        
        return spMat;
    }
}