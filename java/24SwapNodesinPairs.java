/*
24. Swap Nodes in Pairs

Given a linked list, swap every two adjacent nodes and return its head.

For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.

Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode cur = head;
        
        head = cur.next;
        cur.next = head.next;
        head.next = cur;
        
        ListNode pre = cur;
        cur = cur.next;
        
        while(cur != null){
            if(cur.next == null){
                break;
            }
            else{
                ListNode temp = cur.next;
                pre.next = temp;
                cur.next = temp.next;
                temp.next = cur;
                
                pre = cur;
                cur = cur.next;
            }
        }
        
        return head;
    }
}