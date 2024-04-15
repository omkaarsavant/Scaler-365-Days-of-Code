public class Solution {
    public int isPalindrome(int A) {
        String str = Integer.toString(A);

        int start = 0;
        int end = str.length() - 1;
        
        // While the start pointer is less than the end pointer
        while (start < end) {
            // If the characters at the start and end of the string are not the same, return 0
            if (str.charAt(start) != str.charAt(end)) {
                return 0;
            }
            
            // Move the start pointer towards the center
            start++;
            
            // Move the end pointer towards the center
            end--;
        }
        
        // If the entire string has been checked and no discrepancies have been found, return 1
        return 1;
    }
}
