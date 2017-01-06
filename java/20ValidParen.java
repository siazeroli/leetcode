/*
20. Valid Parentheses

Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
*/

public class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> lst = new ArrayList<Character>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ']'){
                if(lst.size() == 0){
                    return false;
                }
                if(lst.get(lst.size()-1) == '['){
                    lst.remove(lst.size()-1);
                }
                else{
                    return false;
                }
            }
            else if(s.charAt(i) == ')'){
                if(lst.size() == 0){
                    return false;
                }
                if(lst.get(lst.size()-1) == '('){
                    lst.remove(lst.size()-1);
                }
                else{
                    return false;
                }
            }
            else if(s.charAt(i) == '}'){
                if(lst.size() == 0){
                    return false;
                }
                if(lst.get(lst.size()-1) == '{'){
                    lst.remove(lst.size()-1);
                }
                else{
                    return false;
                }
            }
            else{
                lst.add(s.charAt(i));
            }
        }
        
        if(lst.size() == 0){
            return true;
        }
        else{
            return false;
        }
    }
}