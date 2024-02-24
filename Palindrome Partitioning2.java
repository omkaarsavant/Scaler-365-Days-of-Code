public class Solution {
    public int minPathSum(ArrayList<ArrayList<Integer>> A) {
        int m = A.size();
        int n = A.get(0).size();
        
  
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j != 0) {
                 
                    A.get(i).set(j, A.get(i).get(j) + A.get(i).get(j - 1));
                } else if (i != 0 && j == 0) {
                 
                    A.get(i).set(j, A.get(i).get(j) + A.get(i - 1).get(j));
                } else if (i != 0 && j != 0) {
                    // For other cells, we can come either from above or from the left
                    A.get(i).set(j, A.get(i).get(j) + Math.min(A.get(i - 1).get(j), A.get(i).get(j - 1)));
                }
            }
        }
        
        // The bottom-right cell contains the minimum path sum from top-left to bottom-right
        return A.get(m - 1).get(n - 1);
    }
}
