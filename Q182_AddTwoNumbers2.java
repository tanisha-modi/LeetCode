// link to thw question --> https://leetcode.com/problems/add-two-numbers/description/

class Solution {
    public ListNode addTwoNumbers(ListNode h1, ListNode h2) {
         ListNode head = new ListNode(0);
        ListNode temp = head;
        int carry = 0;

        while (h1 != null || h2 != null || carry != 0) {
            int sum = carry;

            if (h1 != null) {
                sum += h1.val;
                h1 = h1.next;
            }
            if (h2 != null) {
                sum += h2.val;
                h2 = h2.next;
            }

            carry = sum / 10;
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
        }

        return head.next;
    }
}