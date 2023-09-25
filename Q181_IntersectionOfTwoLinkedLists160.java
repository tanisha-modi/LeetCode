// link to the question --> https://leetcode.com/problems/intersection-of-two-linked-lists/description/

// ----------------------------------------------------------
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode a = headA;
        ListNode b = headB;
        while(a != b){
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }
}

// -----------------------------------------------------------
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode a = headA;
        ListNode b = headB;
        int countA = 1, countB =1;
        while(a != null){
            a= a.next;
            countA++;
        }
        while(b!= null){
            b = b.next;
            countB++;
        }
        if(countA > countB){
            countA = countA - countB;
            a = headA;
            b = headB;
        }
        else{
            countA = countB - countA;
             a = headB;
             b = headA;
        }
        while(countA > 0){
            a = a.next;
            countA--;
        }
        while( a!= null && b!= null){
            if(a == b){
                return a;
            }
            a = a.next;
            b = b.next;
        }
        return null;
    }
}