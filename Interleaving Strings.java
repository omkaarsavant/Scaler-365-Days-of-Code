public class Solution {
    public int isInterleave(String A, String B, String C) {
        int m = A.length();
        int n = B.length();
        int len = C.length();

        if (m + n != len) {
            return 0;
        }

        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;

        // Fill the DP matrix.
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i > 0 && A.charAt(i - 1) == C.charAt(i + j - 1)) {
                    dp[i][j] |= dp[i - 1][j];
                }
                if (j > 0 && B.charAt(j - 1) == C.charAt(i + j - 1)) {
                    dp[i][j] |= dp[i][j - 1];
                }
            }
        }

        // Return 1 if C can be formed by interleaving A and B, else return 0.
        return dp[m][n] ? 1 : 0;
    }
}
