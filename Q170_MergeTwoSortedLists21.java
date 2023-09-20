// link to the question --> https://leetcode.com/problems/merge-two-sorted-lists/description/

class Solution {
    public ListNode mergeTwoLists(ListNode node1, ListNode node2) {

        ListNode head = new ListNode();
        ListNode result = head;
        while(node1 != null && node2 != null){
            if( node1.val < node2.val){
                result.next = node1;
                node1 = node1.next;
            }
            else{
                 result.next = node2;
                node2 = node2.next;
            }
            result = result.next;
        }
        if(node1 != null){
            result.next = node1;
        }
        if(node2 != null){
            result.next = node2;
        }
        return head.next;
    }
}