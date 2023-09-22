// link to the question --> https://leetcode.com/problems/reverse-linked-list-ii/

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right || head.next == null) return head;
        
        ListNode current = head;
        ListNode prev = null;
        
        for (int i = 0; current != null &&  i < left - 1; i++) {
            prev = current;
            current = current.next;
        }
        ListNode last = prev;
        ListNode newEnd = current;
        
        for (int i = 0; current != null && i < right - left +1; i++) {
            ListNode nextNode = current.next;
            current.next = prev;

            prev = current;
            current = nextNode;
        }
        if(last != null){
            last.next = prev;
        }
        else{
            head = prev;
        }
        newEnd.next = current;

        return head;
    }
}