/*
345. Reverse Vowels of a String

Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
Given s = "hello", return "holle".

Example 2:
Given s = "leetcode", return "leotcede".

Note:
The vowels does not include the letter "y".
*/

public class Solution {
    public String reverseVowels(String s) {
        
        if(s.length() == 0 && s.length() == 1){
            return s;
        }
        
        int start = 0;
        int end = s.length() - 1;
        Set<Character> vowel = new HashSet<Character>(Arrays.asList('a', 'e','i','o','u','A','E','I','O','U'));
        char[] c = s.toCharArray();
        boolean stop1 = false;
        boolean stop2 = false;
        
        while(start < end){
            if(!vowel.contains(c[start]) && !stop1){
                start++;
            }
            else if(vowel.contains(c[start])){
                stop1 = true;
            }
            
            if(!vowel.contains(c[end]) && !stop2){
                end--;
            }
            else if(vowel.contains(c[end])){
                stop2 = true;
            }
            
            if(vowel.contains(c[start]) &&
               vowel.contains(c[end])){
                stop1 = false;
                stop2 = false;
                
                char temp = c[start];
                c[start] = c[end];
                c[end] = temp;
                
                start++;
                end--;
            }
        }
        
        return new String(c);
    }
}