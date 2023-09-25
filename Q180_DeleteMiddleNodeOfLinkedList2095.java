// link to the question --> https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null)
        return null;
        ListNode fast = head;
        ListNode slow = head;
        ListNode preSlow = head;
        while(fast != null && fast.next != null){
            preSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        preSlow.next = slow.next;
        return head;
    }
}