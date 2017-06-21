/*
113. Path Sum II

Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

For example:
Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \    / \
        7    2  5   1
return
[
   [5,4,11,2],
   [5,8,4,5]
]
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> l = new ArrayList<Integer>();
        recursion(root, sum, l, result);
        return result;
    }
    
    public void recursion(TreeNode node, int sum, List<Integer> cur, List<List<Integer>> result){
        
        if(node == null){
            return;
        }
        
        cur.add(node.val);
        
        if(node.left == null && node.right == null && sum == node.val){
            result.add(new ArrayList(cur));
            cur.remove(cur.size()-1);
            return;
        }
        else{
            recursion(node.left, sum - node.val, cur, result);
            recursion(node.right, sum - node.val, cur, result);
        }
        
        cur.remove(cur.size()-1);
    }
}