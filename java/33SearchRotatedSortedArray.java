/*
33. Search in Rotated Sorted Array

Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

You are given a target value to search. If found in the array return its index, otherwise return -1.

You may assume no duplicate exists in the array.
*/

public class Solution {
    public int search(int[] nums, int target) {
        
       if(nums.length == 0){
           return -1;
       }
       
       if(nums.length == 1){
           return nums[0] == target?0:-1;
       }
       
       int i = 0;
       int j = nums.length - 1;
       int mid = (j - i)/2;
       
       while(i < j){
           if(nums[i] == target){
               return i;
           }
           
           if(nums[j] == target){
               return j;
           }
           
           i++;
           j--;
       }
       
       return nums[mid] == target?mid:-1;
    }
}