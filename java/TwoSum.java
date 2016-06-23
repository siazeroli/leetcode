/*
1. Two Sum

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

The return format had been changed to zero-based indices. Please read the above updated description carefully.
*/

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        
        for(int i = 0; i < nums.length-1; i++){
          if(nums[i]+nums[i+1] == target){
              indices[0] = i;
              indices[1] = i + 1;
              break;
          }
        }
        
        return indices;
    }
}