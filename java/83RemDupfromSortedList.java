/*
83. Remove Duplicates from Sorted List

Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
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
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> dup = new HashSet<Integer>();
        
        if(head == null){
            return head;
        }
        
        ListNode pre = head;
        dup.add(pre.val);
        
        if(pre.next == null){
            return head;
        }
        
        ListNode cur = head.next;
        
        while(cur != null){
            if(dup.contains(cur.val)){
                pre.next = cur.next;
                cur.next = null;
                cur = pre.next;
            }
            else{
                dup.add(cur.val);
                pre = cur;
                cur = cur.next;
            }
        }
        
        return head;
    }
}