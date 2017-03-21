/*
82. Remove Duplicates from Sorted List II

Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

For example,
Given 1->2->3->3->4->4->5, return 1->2->5.
Given 1->1->1->2->3, return 2->3.
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
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        
        ListNode pre = dummyHead;
        ListNode cur = head;
        Set<Integer> dup = new HashSet<Integer>();
        
        while(cur != null){
            if(cur.next != null && cur.val == cur.next.val){
                dup.add(cur.val);
                pre.next = cur.next.next;
                cur = cur.next.next;
            }
            else if(dup.contains(cur.val)){
                pre.next = cur.next;
                cur = cur.next;
            }
            else{
                pre = cur;
                cur = cur.next;
            }
        }
        
        return dummyHead.next;
    }
}