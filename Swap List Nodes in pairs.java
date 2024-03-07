public class Solution {
    public ListNode swapPairs(ListNode A) {
        if (A == null || A.next == null) {
            return A;
        }
        
        ListNode newHead = A.next;
        
        ListNode prev = null;
        while (A != null && A.next != null) {
            ListNode nextNode = A.next;
            A.next = nextNode.next;
            nextNode.next = A;
            
            if (prev != null) {
                prev.next = nextNode;
            }
            
            prev = A;
            A = A.next;
        }
        
        return newHead;
    }
}
