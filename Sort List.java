public class Solution {
    public ListNode sortList(ListNode A) {
        if (A == null || A.next == null) {

            return A;
        }
      
        ListNode mid = getMid(A);
        ListNode secondHalf = mid.next;
        mid.next = null;  

        ListNode left = sortList(A);
        ListNode right = sortList(secondHalf);

        // Merge the sorted halves
        return merge(left, right);
    }

    // Get the middle node of a linked list iteratively
    private ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Merge two sorted linked lists
    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);  // Dummy head for convenience
        ListNode current = dummyHead;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        // Append the remaining elements from either list
        current.next = l1 != null ? l1 : l2;

        return dummyHead.next;  // Return the actual sorted list
    }
}
