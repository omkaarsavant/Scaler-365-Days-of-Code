public class Solution {
    public ListNode detectCycle(ListNode a) {
        if (a == null || a.next == null)
            return null;

        ListNode slow = a, fast = a;

        do {
            slow = slow.next;
            fast = fast.next;
            if (fast != null)
                fast = fast.next;
        } while (fast != null && fast != slow);

        // If there is no cycle, return null
        if (fast == null)
            return null;

        // Phase 2: Find the start of the cycle
        slow = a;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}
