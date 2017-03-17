/*
349. Intersection of Two Arrays

Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

Note:
Each element in the result must be unique.
The result can be in any order.
*/

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> intersection = new HashSet<Integer>();
        
        for(int i = 0; i < nums1.length; i++){
            set.add(nums1[i]);
        }
        
        for(int i = 0; i < nums2.length; i++){
            if(set.contains(nums2[i])){
                intersection.add(nums2[i]);
            }
        }
        
        int[] inter = new int[intersection.size()];
        Iterator<Integer> it = intersection.iterator();
        
        int count = 0;
        while(it.hasNext()){
            inter[count] = it.next();
            count += 1;
        }
        
        Arrays.sort(inter);
        
        return inter;
        
        
    }
}