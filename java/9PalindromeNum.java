/*
9. Palindrome Number
Determine whether an integer is a palindrome. Do this without extra space.

Some hints:
Could negative integers be palindromes? (ie, -1)

If you are thinking of converting the integer to string, note the restriction of using extra space.

You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?

There is a more generic way of solving this problem.
*/

public class Solution {
    public boolean isPalindrome(int x) {
        // if int is less than 0, it cannot be palindrome
        if(x < 0){
            return false;
        }
        
        // if int has exactly one digit, it should be palindrome
        if(Integer.toString(x).length() == 1){
            return true;
        }
        
        String s = Integer.toString(x);
        boolean flag = true;
        
        for(int i = 0; i < s.length()/2; i++){
          if((int)s.charAt(i) != (int)s.charAt(s.length()-1-i)){
            flag = false;
          }
        }
        
        return flag;
    }
}