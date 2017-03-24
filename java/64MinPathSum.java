/*
64. Minimum Path Sum

Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.
*/

public class Solution {
    public int minPathSum(int[][] grid) {

        // Bad try with Greedy Algorithm
        /*
        int row = 0;
        int col = 0;
        int sum = grid[row][col];
        
        while( row != grid.length - 1 || col != grid[0].length - 1 ){
            if(row == grid.length - 1){
                col++;
                sum += grid[row][col];
            }
            else if(col == grid[0].length - 1){
                row++;
                sum += grid[row][col];
            }
            
            if(row < grid.length - 1 &&
               col < grid[0].length - 1 &&
               grid[row][col+1] >= grid[row+1][col]){
                row++;
                sum += grid[row][col];
            }
            else if(row < grid.length - 1 &&
                    col < grid[0].length - 1 &&
                    grid[row][col+1] > grid[row+1][col]){
                col++;
                sum += grid[row][col];            
            }
        }
        
        return sum;
        */
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(i == 0 && j > 0){
                    grid[i][j] += grid[i][j-1];
                }
                
                if(j == 0 && i > 0){
                    grid[i][j] += grid[i-1][j];
                }
                
                if(i > 0 && j > 0){
                    if(grid[i-1][j] >= grid[i][j-1]){
                        grid[i][j] += grid[i][j-1];
                    }
                    else if(grid[i-1][j] < grid[i][j-1]){
                        grid[i][j] += grid[i-1][j];
                    }
                }
            }
        }
        
        return grid[grid.length - 1][grid[0].length - 1];
    }
}