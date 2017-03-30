/*
219. Contains Duplicate II

Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
*/

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length == 0 || nums.length == 1){
            return false;
        }
        
        Map<Integer,Integer> record = new HashMap<Integer,Integer>();
        
        for(int i = 0; i < nums.length; i++){
            if(record.containsKey(nums[i])){
                if(i - record.get(nums[i]) <= k){
                    return true;
                }
                else{
                    record.put(nums[i],i);
                }
            }
            else{
                record.put(nums[i],i);
            }
        }
        
        return false;
    }
}