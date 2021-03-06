/*
104. Maximum Depth of Binary Tree

Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
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
    public int maxDepth(TreeNode root) {
        return dfs(root,0,0);
    }
    
    public int dfs(TreeNode node, int level, int maxLevel){
        if(node == null){
            return maxLevel;
        }
        
        level++;
        
        if(node.left == null && node.right == null){
            if(level > maxLevel){
                maxLevel = level;
            }
            level--;
            return maxLevel;
        }
        else{
            maxLevel = dfs(node.left,level,maxLevel);
            maxLevel = dfs(node.right,level,maxLevel);
        }
        
        level--;
        return maxLevel;
    }
}