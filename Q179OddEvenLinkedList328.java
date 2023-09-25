// link to the question --> https://leetcode.com/problems/odd-even-linked-list/description/

class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp1 = head;
        ListNode newHead = head.next;
        ListNode preTemp = head;
        while(temp1 != null && temp1.next != null){
            ListNode temp2 = temp1.next;
            temp1.next = temp1.next.next; 
            if(temp2.next != null){   
            temp2.next = temp2.next.next;
            }
            preTemp = temp1;
            temp1 = temp1.next;
        }
        if(temp1 == null){
            preTemp.next = newHead;
        }else{

        temp1.next = newHead;
        }
        return head;
    }
}