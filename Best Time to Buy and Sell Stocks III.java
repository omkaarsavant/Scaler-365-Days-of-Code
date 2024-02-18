public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxProfit(final List<Integer> A) {
        if (A == null || A.size() == 0) {
            return 0;
        }

        int n = A.size();
        int k = 2; // Number of transactions allowed
        int[][] buy = new int[k + 1][n];
        int[][] sell = new int[k + 1][n];

        for (int i = 0; i <= k; i++) {
            buy[i][0] = -A.get(0);
            sell[i][0] = 0;
        }

        for (int i = 1; i <= k; i++) {
            for (int j = 1; j < n; j++) {
                buy[i][j] = Math.max(buy[i][j - 1], sell[i - 1][j - 1] - A.get(j));
                sell[i][j] = Math.max(sell[i][j - 1], buy[i][j - 1] + A.get(j));
            }
        }

        return sell[k][n - 1];
    }
}
