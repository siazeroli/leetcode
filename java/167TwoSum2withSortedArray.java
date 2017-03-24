/*
167. Two Sum II - Input array is sorted

Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution and you may not use the same element twice.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2
*/

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int index1 = 0;
        int index2 = numbers.length - 1;
        int[] result = new int[2];
        
        while(index1 < index2){
            if(numbers[index1] + numbers[index2] == target){
                result[0] = index1 + 1;
                result[1] = index2 + 1;
                return result;
            }
            else if(numbers[index1] + numbers[index2] > target){
                index2--;
            }
            else{
                index1++;
            }
        }
        
        return result;
    }
}