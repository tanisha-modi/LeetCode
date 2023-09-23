// link to the question --> https://leetcode.com/problems/reorder-list/description/

class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }
        ListNode mid = findMid(head);
        ListNode pre = null;
        while(mid != null){
            ListNode nextNode = mid.next;
            mid.next = pre;

            pre = mid;
            mid = nextNode;
        }
        mid = pre;
        ListNode start = head;
        while(start != null && mid != null){
            ListNode temp1 = start.next;
            ListNode temp2 = mid.next;

            start.next = mid;
            mid.next = temp1;

            start = temp1;
            mid = temp2;
        }
        
    }
    private ListNode findMid(ListNode head){
        ListNode slow = head;
        while(head != null && head.next != null){
            slow = slow.next;
            head = head.next.next;
        }
        ListNode mid = slow.next;
        slow.next = null;
        return mid;
    }
}