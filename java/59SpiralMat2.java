/*
59. Spiral Matrix II

Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

For example,
Given n = 3,

You should return the following matrix:
[
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
]
*/

public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        
        int num = 0;
        int i = 0;
        int j = n - 1;
        
        while(num != Math.pow(n,2)){
            
            for(int col = 0; col < n; col++){
                if(mat[i][col] == 0){
                    num += 1;
                    mat[i][col] = num;
                }
            }
            
            for(int row = 0; row < n; row++){
                if(mat[row][j] == 0){
                    num += 1;
                    mat[row][j] = num;
                }
            }
            
            for(int col = n - 1; col >= 0; col--){
                if(mat[n-i-1][col] == 0){
                    num += 1;
                    mat[n-i-1][col] = num;
                }
            }
            
            for(int row = n - 1; row >= 0; row--){
                if(mat[row][n-j-1] == 0){
                    num += 1;
                    mat[row][n-j-1] = num;
                }
            }
            
            i += 1;
            j -= 1;
        }
        
        return mat;
    }
}