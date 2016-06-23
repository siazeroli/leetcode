/*
2. Add Two Numbers

You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode result = new ListNode(0);
        ListNode temp = result;
        
        while(true){
            int sum = 0;
            if(l1 != null && l2 != null){
                sum = l1.val + l2.val + carry;
                l1 = l1.next;
                l2 = l2.next;
            }
            else if(l1 != null){
                sum = l1.val + carry;
                l1 = l1.next;
            }
            else if(l2 != null){
                sum = l2.val + carry;
                l2 = l2.next;
            }
            else if(carry == 1){
                sum = carry;
            }
            else{
                break;
            }
            
            if(sum >= 10){carry = 1;}
            else{ carry = 0;}
            
            temp.next = new ListNode(0);
            temp = temp.next;
            temp.val = sum%10;
        }
        
        result = result.next;
        return result;
    }
}