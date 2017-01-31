/*
Given an array of strings, group anagrams together.

For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], 
Return:

[
  ["ate", "eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note: All inputs will be in lower-case.
*/

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String,List<String>>();
        List<List<String>> result = new ArrayList<List<String>>();
        
        for(String str:strs){
            String origin = new String(str);
            char[] carr = str.toCharArray();
            Arrays.sort(carr);
            String trans = new String(carr);
            
            if(map.containsKey(trans)){
                List<String> tempList = map.get(trans);
                tempList.add(origin);
            }
            else{
                List<String> newList = new ArrayList<String>();
                newList.add(origin);
                map.put(trans,newList);
            }
        }
        
        for(String key:map.keySet()){
            result.add(map.get(key));
        }
        
        return result;
    }
}