public class Solution {
    public int minCut(String A) {
        int n = A.length();
        boolean[][] dp = new boolean[n][n];
        int[] cut = new int[n];
        
        for (int j = 0; j < n; j++) {
            cut[j] = j; 
            for (int i = 0; i <= j; i++) {
                if (A.charAt(i) == A.charAt(j) && (j - i < 2 || dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                  
                    if (i > 0) {
                        cut[j] = Math.min(cut[j], cut[i - 1] + 1);
                    } else {
                        // if i is 0, then don't need to cut anymore
                        cut[j] = 0; 
                    }
                }
            }
        }
        
        return cut[n - 1];
    }
}
