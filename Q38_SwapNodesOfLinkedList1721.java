// link to the question --> https://leetcode.com/problems/swapping-nodes-in-a-linked-list/description/

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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;

        for(int i = 1; i < k; i++){
            fast = fast.next;
        }
        ListNode first = fast;

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        int temp = first.val;
        first.val = slow.val;
        slow.val = temp;
        return head;
    }
}