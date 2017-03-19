/*
141. Linked List Cycle

Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?
*/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        if(head == null || head.next == null){
            return false;
        }
        
        ListNode cur = head;
        ListNode next;
        
        while(cur.next != null){
            next = cur.next;
            
            if(next.next != null && next == head && next.val == head.val){
                return true;
            }
            
            ListNode temp = cur;
            cur = cur.next;
            
            next = temp;
            next.next = head;
            
        }
        
        return false;
        
    }
}