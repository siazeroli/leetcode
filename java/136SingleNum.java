/*
136. Single Number

Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
*/

public class Solution {
    public int singleNumber(int[] nums) {
        
        if(nums.length == 1){
            return nums[0];
        }
        
        Arrays.sort(nums);
        
        for(int i = 1; i < nums.length; i++){
            
            if(i == 1 && nums[i] != nums[i-1]){
                return nums[i-1];
            }
            
            if(nums[i-1] != nums[i] &&
               i < nums.length - 1 &&
               nums[i] != nums[i+1]){
                   return nums[i];
            }
        }
        
        return nums[nums.length - 1];
    }
}