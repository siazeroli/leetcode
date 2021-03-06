/*
169. Majority Element

Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
*/

public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> count = new HashMap<Integer,Integer>();
        
        for(int i = 0; i < nums.length; i++){
            if(count.containsKey(nums[i])){
                count.put(nums[i],count.get(nums[i])+1);
            }
            else{
                count.put(nums[i],1);
            }
            
            if(count.get(nums[i]) > nums.length / 2){
                return nums[i];
            }
        }
        
        return 0;
    }
}