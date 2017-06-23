/*
56. Merge Intervals

Given a collection of intervals, merge all overlapping intervals.

For example,
Given [1,3],[2,6],[8,10],[15,18],
return [1,6],[8,10],[15,18].
*/

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> result = new ArrayList<Interval>();
        
        int [] start = new int[intervals.size()];
        int [] end = new int[intervals.size()];
        
        for(int i = 0; i < intervals.size(); i++){
            start[i] = intervals.get(i).start;
            end[i] = intervals.get(i).end;
        }
        
        Arrays.sort(start);
        Arrays.sort(end);
        
        int i = 0;
        int j = 0;
        while(i < intervals.size()){
            if(i == intervals.size() - 1 || start[i+1] > end[i]){
                result.add(new Interval(start[j],end[i]));
                j = i+1;
            }
            
            i++;
        }
        
        return result;
    }
}