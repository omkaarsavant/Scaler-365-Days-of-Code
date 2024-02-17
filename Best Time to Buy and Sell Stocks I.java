public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxProfit(final List<Integer> A) {
        if (A == null || A.size() == 0) {
            return 0;
        }

        int minPrice = A.get(0);
        int maxProfit = 0;

        for (int i = 1; i < A.size(); i++) {
            if (A.get(i) < minPrice) {
                minPrice = A.get(i);
            } else if (A.get(i) - minPrice > maxProfit) {
                maxProfit = A.get(i) - minPrice;
            }
        }

        return maxProfit;
    }
}
