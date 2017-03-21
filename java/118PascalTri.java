/*
118. Pascal's Triangle

Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
*/

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        for(int i = 0; i < numRows; i++){
            
            if(i == 0){
                List<Integer> temp = new ArrayList<Integer>();
                temp.add(1);
                result.add(temp);
            }
            else if(i == 1){
                List<Integer> temp = new ArrayList<Integer>();
                temp.add(1);
                temp.add(1);
                result.add(temp);
            }
            else{
                List<Integer> temp = new ArrayList<Integer>();
                temp.add(1);
                
                for(int j = 1; j < i; j++){
                    List<Integer> lst = result.get(i-1);
                    temp.add(lst.get(j-1) + lst.get(j));
                }
                
                temp.add(1);
                result.add(temp);
            }
        }
        
        return result;
    }
}