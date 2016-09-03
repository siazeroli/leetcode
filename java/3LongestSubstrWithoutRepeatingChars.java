/*
3. Longest Substring Without Repeating Characters
Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        // deal with string with length 0 or 1
        if(s.length() == 0){
            return 0;
        }
        else if(s.length() == 1){
            return 1;
        }

        // use index array to note the length of substr
        int[] index = new int[s.length()];
        index[index.length - 1] = 1;
        
        // loop to find the substr we need
        for(int i = 0; i < s.length() - 1; i++){
            Set<Integer> buffer = new HashSet<Integer>();
            buffer.add((int)s.charAt(i));
            for(int j = i + 1; j < s.length(); j++){
               int cur = (int)s.charAt(j);
               if(!buffer.contains(cur)){
                   buffer.add(cur);
               }
               else{
                   break;
               }
            }
            index[i] = buffer.size();
        }

        // find the longest length of substr
        int maxValue = 0;
        
        for(int i = 0; i < index.length; i++){
            if(index[i] > maxValue){
                maxValue = index[i];
            }
        }
        
        return maxValue;
    }
}