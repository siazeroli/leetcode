/*
520. Detect Capital

Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital if it has more than one letter, like "Google".
Otherwise, we define that this word doesn't use capitals in a right way.
Example 1:
Input: "USA"
Output: True
Example 2:
Input: "FlaG"
Output: False
Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.
*/

public class Solution {
    public boolean detectCapitalUse(String word) {
        if(word == null || word.length() == 0){
            return true;
        }
        
        boolean allCap = true;
        boolean allLow = true;
        boolean reCap = false;
        
        for(int i = 0; i < word.length(); i++){
            
            if((int)word.charAt(0) >= 65 && 
               (int)word.charAt(0) <= 90){
                   allLow = false;
                   
                   if(i > 0 &&
                      (int)word.charAt(i) >= 65 && 
                      (int)word.charAt(i) <= 90){
                          reCap = true;
                   }
                   else if(i > 0 && reCap){
                       allCap = false;
                       return false;
                   }
                   else if(i > 0){
                       allCap = false;
                   }
            }
            else{
                   allCap = false;
                   
                   if(i > 0 &&
                      (int)word.charAt(i) >= 97 && 
                      (int)word.charAt(i) <= 122 &&
                      allLow){
                          continue;
                   }
                   else if(i > 0){
                       allLow = false;
                       return false;
                   }
            }
        }
        
        if(allLow || allCap){
            return true;
        }
        
        if(reCap){
            return false;
        }
        
        return true;
    }
}