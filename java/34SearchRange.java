/*
34. Search for a Range

Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

For example,
Given [5, 7, 7, 8, 8, 10] and target value 8,
return [3, 4].
*/

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] result = new int[]{-1,-1};
        if(nums.length == 0){
            return result;
        }
        else if(nums.length == 1 && nums[0] == target){
            result[0] = 0;
            result[1] = 0;
            return result;
        }
        else if(nums.length == 1){
            return result;
        }
        
        int start = 0;
        int end = nums.length - 1;
        boolean stop = false;
        
        while(start < end && !stop){
            if(nums[start] != target){
                start++;
            }
            
            if(nums[end] != target){
                end--;
            }
            
            if(nums[start] == target &&
               nums[end] == target){
                stop = true;
            }
        }
        
        if(stop){
            result[0] = start;
            result[1] = end;
        }
        return result;
    }
}