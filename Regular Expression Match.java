public class Solution {
    public int isMatch(final String A, final String B) {
        int m = A.length();
        int n = B.length();
        
        // dp[i][j] will be true if first i characters in given string matches the first j characters of pattern.
        boolean[][] dp = new boolean[m + 1][n + 1];
        
        // Both strings are empty
        dp[0][0] = true;
        
        // Pattern is empty
        for (int i = 1; i <= m; i++) {
            dp[i][0] = false;
        }
        
        // String is empty
        for (int j = 1; j <= n; j++) {
            if (B.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
        }
        
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // Two cases if we see a '*'
                // a) We ignore '*' character and move to next character in the pattern, i.e., '*' indicates an empty sequence.
                // b) '*' character matches with ith character in input
                if (B.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
                } else if (B.charAt(j - 1) == '?' || A.charAt(i - 1) == B.charAt(j - 1)) {
                    // Current characters are considered as matching in two cases
                    // (a) current character of pattern is '?'
                    // (b) characters actually match
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    // If characters don't match
                    dp[i][j] = false;
                }
            }
        }
        
        return dp[m][n] ? 1 : 0;
    }
}
