/*
367. Valid Perfect Square

Given a positive integer num, write a function which returns True if num is a perfect square else False.

Note: Do not use any built-in library function such as sqrt.

Example 1:

Input: 16
Returns: True
Example 2:

Input: 14
Returns: False
*/

public class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 0 || num == 1){
            return true;
        }
        
        for(int i = 0; i <= num / 2; i++){
            if(i*i == num){
                return true;
            }
        }
        
        return false;
    }
}