/*
112. Path Sum

Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

For example:
Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \      \
        7    2      1
return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
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
    public boolean hasPathSum(TreeNode root, int sum) {
        return recursion(root,sum,false);
    }
    
    public boolean recursion(TreeNode node, int sum, boolean has){
        
        if(node == null){
            return has;
        }
        
        if(node.left == null && node.right == null && node.val == sum){
            has = true;
            return has;
        }
        else{
            has = recursion(node.left,sum-node.val,has);
            has = recursion(node.right,sum-node.val,has);
        }
        
        return has;
    }
}