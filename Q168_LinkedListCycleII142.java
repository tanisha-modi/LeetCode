// link to the question --> https://leetcode.com/problems/linked-list-cycle-ii/description/

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
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }

        ListNode fast = head; 
        ListNode slow = head; 

        while(fast.next != null && fast.next.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                 slow = head;
        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
return slow;
            }
        }
       
        return null;
    }
}