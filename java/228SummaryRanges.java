/*
228. Summary Ranges

Given a sorted integer array without duplicates, return the summary of its ranges.

For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
*/

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> l = new ArrayList<String>();
        
        if(nums.length == 0){
            return l;
        }
        
        if(nums.length == 1){
            l.add(String.valueOf(nums[0]));
            return l;
        }
        
        int start = nums[0];
        int end = nums[nums.length-1];
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] - nums[i-1] != 1){
                end = nums[i-1];
                
                if(start != end){
                    StringBuilder sb = new StringBuilder();
                    sb.append(String.valueOf(start));
                    sb.append("->");
                    sb.append(String.valueOf(end));
                    l.add(sb.toString());
                }
                else{
                    l.add(String.valueOf(start));
                }
                
                start = nums[i];
            }
        }
        
        if(start != nums[nums.length-1]){
            end = nums[nums.length-1];
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(start));
            sb.append("->");
            sb.append(String.valueOf(end));
            l.add(sb.toString());
        }
        else{
            l.add(String.valueOf(start));
            
        }
        
        return l;
    }
}