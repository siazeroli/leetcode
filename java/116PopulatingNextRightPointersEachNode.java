/*
116. Populating Next Right Pointers in Each Node

Given a binary tree

    struct TreeLinkNode {
      TreeLinkNode *left;
      TreeLinkNode *right;
      TreeLinkNode *next;
    }
Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

Initially, all next pointers are set to NULL.

Note:

You may only use constant extra space.
You may assume that it is a perfect binary tree (ie, all leaves are at the same level, and every parent has two children).
For example,
Given the following perfect binary tree,
         1
       /  \
      2    3
     / \  / \
    4  5  6  7
After calling your function, the tree should look like:
         1 -> NULL
       /  \
      2 -> 3 -> NULL
     / \  / \
    4->5->6->7 -> NULL
*/

/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        
        if(root == null){
            return;
        }
        
        List<TreeLinkNode> q = new ArrayList<TreeLinkNode>();
        q.add(root);
        
        int level = 0;
        int lvlCount = 1;
        
        while(!q.isEmpty()){
            
            if(lvlCount == 0){
                level += 1;
                lvlCount = (int)Math.pow(2,level);
            }
            
            TreeLinkNode temp = q.get(0);
            q.remove(0);
            
            if(lvlCount == 1){
                temp.next = null;
            }
            else{
                TreeLinkNode next = q.get(0);
                temp.next = next;
            }
            
            if(temp.left != null){
                q.add(temp.left);
            }
            
            if(temp.right != null){
                q.add(temp.right);
            }
            
            lvlCount--;
            
        }
    }
}