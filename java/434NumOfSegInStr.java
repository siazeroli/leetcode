/*
434. Number of Segments in a String

Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.

Please note that the string does not contain any non-printable characters.

Example:

Input: "Hello, my name is John"
Output: 5
*/

public class Solution {
    public int countSegments(String s) {
        
        int space = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' ' && i == 0){
                space += 1;
            }
            else if(s.charAt(i) != ' ' && s.charAt(i-1) == ' '){
                space += 1;
            }
        }
        
        return space;
    }
}