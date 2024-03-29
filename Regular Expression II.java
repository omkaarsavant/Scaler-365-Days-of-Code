public class Solution {
    public int isMatch(final String A, final String B) {
        int m = A.length();
        int n = B.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;

        // Initialize base cases
        for (int j = 1; j <= n; j++) {
            if (B.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 2];
            }
        }

        // Fill in the rest of the dp array
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (B.charAt(j - 1) == A.charAt(i - 1) || B.charAt(j - 1) == '.') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (B.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 2] || (dp[i - 1][j] && (A.charAt(i - 1) == B.charAt(j - 2) || B.charAt(j - 2) == '.'));
                }
            }
        }

        return dp[m][n] ? 1 : 0;
    }
}
