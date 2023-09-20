// link to the question --> https://leetcode.com/problems/palindrome-linked-list/description/

class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head, prev, temp;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        prev = slow;
        slow = slow.next;
        prev.next = null;
        while (slow != null) {
            temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        fast = head;
        slow = prev;
        while (slow != null) {
            if (fast.val != slow.val) return false;
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }
}
// --------------------------------------------------------------------------------------------------------------

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
            ListNode middle = findMiddle(head);
            ListNode secHalfStart = reverse(middle.next);
            ListNode FirstHalfStart = head;
            while(secHalfStart != null){
                if(secHalfStart.val != FirstHalfStart.val){
                    return false;
                }
                secHalfStart = secHalfStart.next;
                FirstHalfStart = FirstHalfStart.next;
            }

            return true;
    }
    public ListNode findMiddle(ListNode head){
        ListNode hare = head;
        ListNode turtle = head;

        while(hare.next != null && hare.next.next !=null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode cur = head;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = prev;

            prev = cur;
            cur = next;
        }
        return prev;
    }
}