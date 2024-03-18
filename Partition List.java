public class Solution {
    public ListNode partition(ListNode A, int B) {
        ListNode lessHead = new ListNode(0), greaterHead = new ListNode(0);  
        ListNode less = lessHead, greater = greaterHead;  
        while (A != null) {
            if (A.val < B) {
                less.next = A;
                less = A;
            } else {
                greater.next = A;
                greater = A;
            }
            A = A.next;
        }
        greater.next = null;  // End the greater list
        less.next = greaterHead.next;  // Concatenate the two lists
        return lessHead.next;  // Skip the dummy node
    }
}
