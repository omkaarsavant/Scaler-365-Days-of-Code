/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        if (A == null) {
            return B;
        }
        if (B == null) {
            return A;
        }
        
        ListNode head;
        if (A.val < B.val) {
            head = A;
            A = A.next;
        } else {
            head = B;
            B = B.next;
        }
        
        ListNode current = head;
        while (A != null && B != null) {
            if (A.val < B.val) {
                current.next = A;
                A = A.next;
            } else {
                current.next = B;
                B = B.next;
            }
            current = current.next;
        }
        
        if (A != null) {
            current.next = A;
        } else if (B != null) {
            current.next = B;
        }
        
        return head;
    }
}
