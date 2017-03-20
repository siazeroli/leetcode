/*
206. Reverse Linked List

Reverse a singly linked list.

Hint:
A linked list can be reversed either iteratively or recursively. Could you implement both?
*/

// Iterative version
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode pre = head;
        ListNode cur = head.next;
        
        while(cur != null){
            ListNode next = cur.next;
            
            if(pre == head){
                pre.next = null;
            }
            
            cur.next = pre;
            
            pre = cur;
            
            cur = next;
        }
        
        return pre;
    }
}