/*
500. Keyboard Row

Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.

Example 1:
Input: ["Hello", "Alaska", "Dad", "Peace"]
Output: ["Alaska", "Dad"]
Note:
You may use one character in the keyboard more than once.
You may assume the input string will only contain letters of alphabet.
*/

public class Solution {
    public String[] findWords(String[] words) {
        String[] keyboard = {"qwertyuiop","asdfghjkl","zxcvbnm"};
        List<String> result = new ArrayList<String>();
        
        for(int i = 0; i < words.length; i++){
            int preClass = 0;
            boolean got = true;
            
            for(int j = 0; j < words[i].length(); j++){
                String curChar = String.valueOf(words[i].charAt(j));
                
                for(int k = 0; k < 3; k++){
                    if(keyboard[k].contains(curChar)){
                        if(preClass != 0 && preClass != k+1){
                            got = false;
                            break;
                        }
                        preClass = k+1;
                    }
                }
            }
            
            if(got){
                result.add(words[i]);
            }
        }
        
        String[] r = new String[result.size()];
        result.toArray(r);
        
        return result.toArray(r);
    }
}