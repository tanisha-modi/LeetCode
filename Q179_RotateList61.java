// link to the question --> https://leetcode.com/problems/rotate-list/description/

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(k == 0 || head == null || head.next == null){
            return head;
        }

        ListNode tail = head;

        // step 1  -  calculate the  size of linked list
        int count = 1;
        while(tail.next != null){
            tail = tail.next;
            count++;
        }

        // step 2  -  pointer tail to head of LL
        tail.next = head;
        k = k%count;

        // step - 3
        for(int i =0; i < count - k; i++){
        tail = tail.next;
        }

        // step - 4 
        head = tail.next;
        tail.next = null;
        return head;
    }
}