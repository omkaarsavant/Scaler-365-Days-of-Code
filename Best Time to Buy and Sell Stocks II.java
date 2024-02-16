public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxProfit(final List<Integer> A) {
        int maxProfit = 0;
        for (int i = 1; i < A.size(); i++) {
            int diff = A.get(i) - A.get(i - 1);
            if (diff > 0) {
                maxProfit += diff;
            }
        }
        return maxProfit;
    }
}
