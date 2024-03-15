public class Solution {
    public ListNode removeNthFromEnd(ListNode A, int B) {
        // Handle empty list case
        if (A == null) {
            return null;
        }
        
        ListNode fast = A;
        ListNode slow = A;
        for (int i = 0; i < B; i++) {
            if (fast == null) {
               
                return A.next;
            }
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        while (fast != null && fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // If B is 1 (remove last node)
        if (fast == null) {
            return A.next;
        }

        // Remove the node by linking slow.next to the next of the node to be removed
        slow.next = slow.next.next;
        return A;
    }
}
