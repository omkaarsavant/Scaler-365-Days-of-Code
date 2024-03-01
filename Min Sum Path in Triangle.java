public class Solution {
    public int minimumTotal(ArrayList<ArrayList<Integer>> a) {
        int n = a.size();
        int[] dp = new int[n+1];
        
       
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                // Update the path sum at the current position
                dp[j] = a.get(i).get(j) + Math.min(dp[j], dp[j+1]);
            }
        }
        
        // The minimum path sum is now at the top of the triangle
        return dp[0];
    }
}
