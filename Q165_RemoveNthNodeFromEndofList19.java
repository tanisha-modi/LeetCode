// link to the question --> https://leetcode.com/problems/remove-nth-node-from-end-of-list/

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next ==null){
            return null;
        }
        int size = 0;
        ListNode cur = head;
        while(cur != null){
            cur = cur.next;
            size++;
        }
        n = size -n;
        if(n == 0){
            head = head.next;
            return head;
        }
        cur = head;
        for(int i = 1; i < n; i++){
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return head;
    }
}