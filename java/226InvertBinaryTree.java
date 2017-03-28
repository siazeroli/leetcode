/*
226. Invert Binary Tree

Invert a binary tree.

     4
   /   \
  2     7
 / \   / \
1   3 6   9
to
     4
   /   \
  7     2
 / \   / \
9   6 3   1
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
    public TreeNode invertTree(TreeNode root) {
        
        if(root == null){
            return null;
        }
        
        List<TreeNode> queue = new ArrayList<TreeNode>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            TreeNode temp = queue.get(0);
            queue.remove(0);
            
            TreeNode mid = temp.left;
            temp.left = temp.right;
            temp.right = mid;
            
            if(temp.left != null){
                queue.add(temp.left);
            }
            
            if(temp.right != null){
                queue.add(temp.right);
            }
        }
        
        return root;
    }
}