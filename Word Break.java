public class Solution {
    public int wordBreak(String A, String[] B) {
        int n = A.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true; 
        
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                // Check if the current sub-string is present in the dictionary
                // and the remaining string (after the sub-string) is also valid
                if (dp[j] && Arrays.asList(B).contains(A.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n] ? 1 : 0;
    }
}
