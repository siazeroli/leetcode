/*
119. Pascal's Triangle II

Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].

Note:
Could you optimize your algorithm to use only O(k) extra space?
*/

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> result = new ArrayList<Integer>(Arrays.asList(1));
        int buffer = 0;
        
        while(rowIndex > 0){
            if(result.size() == 1){
                result.add(1);
                buffer = 1;
            }
            else{
                for(int i = 1; i < result.size(); i++){
                    int temp = result.get(i);
                    result.set(i,buffer + result.get(i));
                    buffer = temp;
                }
                result.add(1);
            }
            rowIndex--;
        }
        
        return result;
    }
}