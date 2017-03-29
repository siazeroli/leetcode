/*
217. Contains Duplicate

Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
*/

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean dup = false;
        
        if(nums.length == 0 || nums.length == 1){
            return dup;
        }
        
        Arrays.sort(nums);
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] == nums[i]){
                dup = true;
                break;
            }
        }
        
        return dup;
    }
}