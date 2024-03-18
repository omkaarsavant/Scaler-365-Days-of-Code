public class Solution {
    public ListNode insertionSortList(ListNode A) {
        if (A == null || A.next == null) {
            return A;
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = A;

        while (curr != null) {
            ListNode temp = dummy;
            ListNode next = curr.next;

            while (temp.next != null && temp.next.val < curr.val) {
                temp = temp.next;
            }

            curr.next = temp.next;
            temp.next = curr;
            curr = next;
        }

        return dummy.next;
    }
}
