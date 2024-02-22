public class Solution {
    public int calculateMinimumHP(ArrayList<ArrayList<Integer>> A) {
        int M = A.size();
        int N = A.get(0).size();
        int[][] dp = new int[M][N];

        dp[M - 1][N - 1] = Math.max(1 - A.get(M - 1).get(N - 1), 1);

        for (int i = M - 2; i >= 0; --i) {
            dp[i][N - 1] = Math.max(dp[i + 1][N - 1] - A.get(i).get(N - 1), 1);
        }

        for (int j = N - 2; j >= 0; --j) {
            dp[M - 1][j] = Math.max(dp[M - 1][j + 1] - A.get(M - 1).get(j), 1);
        }

        for (int i = M - 2; i >= 0; --i) {
            for (int j = N - 2; j >= 0; --j) {
                int down = Math.max(dp[i + 1][j] - A.get(i).get(j), 1);
                int right = Math.max(dp[i][j + 1] - A.get(i).get(j), 1);
                dp[i][j] = Math.min(right, down);
            }
        }

        return dp[0][0];
    }
}
