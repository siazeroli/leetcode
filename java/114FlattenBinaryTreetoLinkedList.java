/*
114. Flatten Binary Tree to Linked List

Given a binary tree, flatten it to a linked list in-place.

For example,
Given

         1
        / \
       2   5
      / \   \
     3   4   6
The flattened tree should look like:
   1
    \
     2
      \
       3
        \
         4
          \
           5
            \
             6
click to show hints.

Hints:
If you notice carefully in the flattened tree, each node's right child points to the next node of a pre-order traversal.
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
    public void flatten(TreeNode root) {
        
        if(root == null){
            return;
        }
        
        List<TreeNode> stack = new ArrayList<TreeNode>();
        stack.add(root);
        
        TreeNode dummyRoot = new TreeNode(0);
        
        TreeNode cur = dummyRoot;
        
        while(stack.size() != 0){
            TreeNode temp = stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            
            if(temp.right != null){
                stack.add(temp.right);
            }
            
            if(temp.left != null){
                stack.add(temp.left);
            }
            
            cur.left = null;
            cur.right = temp;
            cur = cur.right;
        }
        
        root = dummyRoot.right;
    }
}