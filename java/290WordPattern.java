/*
290. Word Pattern

Given a pattern and a string str, find if str follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Examples:
pattern = "abba", str = "dog cat cat dog" should return true.
pattern = "abba", str = "dog cat cat fish" should return false.
pattern = "aaaa", str = "dog cat cat dog" should return false.
pattern = "abba", str = "dog dog dog dog" should return false.
Notes:
You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.
*/

public class Solution {
    public boolean wordPattern(String pattern, String str) {
        Map<String,String> ht = new HashMap<String,String>();
        String[] s = str.split(" ");
        
        if(pattern.length() != s.length){
            return false;
        }
        
        for(int i = 0; i < s.length; i++){
            String key = String.valueOf(pattern.charAt(i));
            
            if(!ht.containsKey(key) && !ht.containsValue(s[i])){
                ht.put(key,s[i]);
            }
            else if(!ht.containsKey(key) && ht.containsValue(s[i])){
                return false;
            }
            else if(ht.containsKey(key)){
                if(!ht.get(key).equals(s[i])){
                    return false;
                }
            }
        }
        
        return true;
    }
}