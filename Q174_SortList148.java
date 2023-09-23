// link to the question --> https://leetcode.com/problems/sort-list/description/


// Merge Sort ------------------------------------
class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode mid = findMiddle(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return merge (left, right);
    }

    private ListNode merge(ListNode node1, ListNode node2){
        ListNode head = new ListNode();
        ListNode result = head;
        while(node1 != null && node2 != null){
            if(node1.val < node2.val){
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

    private ListNode findMiddle(ListNode head){
        ListNode preMid = null;

        while(head != null && head.next != null){
            preMid = preMid == null ? head : preMid.next;
            head = head.next.next;
        }
        ListNode mid = preMid.next;
        preMid.next = null;
        return mid;
    }
}


// Arrays.sort ------------------------------------
class Solution {
    public ListNode sortList(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        int[] arr = new int[count];
        temp = head;
        count = 0;
        while(temp!=null){
            arr[count++] = temp.val;
            temp = temp.next;
        }
        Arrays.sort(arr);
        temp = head;
        count = 0;
        while(temp!=null){
            temp.val = arr[count++];
            temp = temp.next;
        }
        return head;
    }
}