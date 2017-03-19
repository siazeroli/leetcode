/*
203. Remove Linked List Elements

Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
// Hint: Create a dummy head in the beginning of list
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        if(head == null){
            return head;
        }
        
        ListNode result = new ListNode(0);
        result.next = head;
        
        ListNode pre = result;
        ListNode cur = result.next;
        
        while(cur != null){
            if(cur.val == val){
                pre.next = cur.next;
                cur = cur.next;
            }
            else{
                pre = cur;
                cur = cur.next;
            }
        }
        
        return result.next;
    }
}