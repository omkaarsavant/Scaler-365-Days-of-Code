public class Solution {
    public int isScramble(final String A, final String B) {
        if (A.equals(B)) {
            return 1;
        }
        
        int[] letters = new int[26];
        for (int i = 0; i < A.length(); i++) {
            char a = A.charAt(i);
            char b = B.charAt(i);
            if (a >= 'a' && a <= 'z' && b >= 'a' && b <= 'z') {
                letters[a - 'a']++;
                letters[b - 'a']--;
            } else {
                return 0; }
        }
        
        for (int i = 0; i < 26; i++) {
            if (letters[i] != 0) {
                return 0;
            }
        }
        
        for (int i = 1; i < A.length(); i++) {
            if (isScramble(A.substring(0, i), B.substring(0, i)) == 1 && 
                isScramble(A.substring(i), B.substring(i)) == 1) {
                return 1;
            }
            if (isScramble(A.substring(0, i), B.substring(B.length() - i)) == 1 && 
                isScramble(A.substring(i), B.substring(0, B.length() - i)) == 1) {
                return 1;
            }
        }
        return 0;
    }
}
