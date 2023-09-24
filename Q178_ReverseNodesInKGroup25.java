// link to the question --> https://leetcode.com/problems/reverse-nodes-in-k-group/description/

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k == 1 || head == null || head.next == null){
            return head;
        }
        int count = listLength(head);
        ListNode current = head;
        ListNode prev = null;
        ListNode last = null;
        while(count >= k){
        
        ListNode newEnd = current;
        
        for (int i = 0; current != null && i < k ; i++) {
            ListNode nextNode = current.next;
            current.next = prev;

            prev = current;
            current = nextNode;
            count--;
        }
        if(last != null){
            last.next = prev;
        }
        else{
            head = prev;
        }
        newEnd.next = current;
        last = newEnd;
        // if(count < k){
        //     break;
        // }
        }
        return head;
    }
    private int listLength(ListNode temp){
        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }
}