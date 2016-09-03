/*
9. Palindrome Number
Determine whether an integer is a palindrome. Do this without extra space.

Some hints:
Could negative integers be palindromes? (ie, -1)

If you are thinking of converting the integer to string, note the restriction of using extra space.

You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?

There is a more generic way of solving this problem.
*/

/*
Solution 1: use one loop to check the relative position is same or not.
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

/*
Solution 2: use method from problem 7 reverse integer to compare original int with reversed integer.
*/

public class Solution {
    public boolean isPalindrome(int x) {
        // if int is less than 0, it cannot be palindrome
        if(x < 0){
            return false;
        }
        
        int origin = x;
        int reversed = reverse(x);
        if(origin == reversed){
            return true;
        }
        else{
            return false;
        }
    }
    
    public int reverse(int x) {
        // if length of the int is 1, just return that int
        if(Integer.toString(x).length() == 1){
            return x;
        }

        // create a buffer to get reversed num digit by digit
        String reversedNum = "";

        // if the int is negative, add - sign to the buffer/
        // and use the abs value of int to do reverseing
        if(x < 0){
            reversedNum = reversedNum + "-";
        }
        x = Math.abs(x);

        // reverse the int digit by digit from very last digit
        while(x != 0){
            int last = x % 10;
            reversedNum = reversedNum + Integer.toString(last);
            x = x / 10;
        }

        // use try/catch to deal with overflow problem
        try{
          int result =  Integer.parseInt(reversedNum);
        }
        catch(NumberFormatException ex){
            return 0;
        }
        
        return Integer.parseInt(reversedNum);
    }
}