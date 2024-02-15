public class Solution {
    public int numDecodings(String A) {
        int n = A.length();
        int MOD = 1000000007;
        long[] dp = new long[n + 1];
        dp[0] = 1;
        dp[1] = A.charAt(0) == '0' ? 0 : 1;

        for (int i = 2; i <= n; i++) {
            char curr = A.charAt(i - 1);
            char prev = A.charAt(i - 2);

            // Check if the current digit is non-zero
            if (curr != '0') {
                dp[i] = dp[i - 1];
            }

            // Check if the last two digits form a valid character
            int twoDigit = (prev - '0') * 10 + (curr - '0');
            if (twoDigit >= 10 && twoDigit <= 26) {
                dp[i] = (dp[i] + dp[i - 2]) % MOD;
            }
        }

        return (int) dp[n];
    }
}
