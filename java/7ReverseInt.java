/*
7. Reverse Integer
Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321

Have you thought about this?
Here are some good questions to ask before coding. Bonus points for you if you have already thought through this!

If the integer's last digit is 0, what should the output be? ie, cases such as 10, 100.

Did you notice that the reversed integer might overflow? Assume the input is a 32-bit integer, then the reverse of 1000000003 overflows. How should you handle such cases?

For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

Update (2014-11-10):
Test cases had been added to test the overflow behavior.
*/

public class Solution {
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