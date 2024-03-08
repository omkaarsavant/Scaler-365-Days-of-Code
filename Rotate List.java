public class Solution {
    public ListNode rotateRight(ListNode A, int B) {
        if (A == null || A.next == null) {
            return A;
        }

 
        int len = 1;
        ListNode tail = A;
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }

        B = B % len;
        if (B == 0) {
            return A;
        }


        int stepsToNewHead = len - B;
        ListNode newTail = A;
        while (stepsToNewHead-- > 1) {
            newTail = newTail.next;
        }

      
        ListNode newHead = newTail.next;
        newTail.next = null;
        tail.next = A;

        return newHead;
    }
}
