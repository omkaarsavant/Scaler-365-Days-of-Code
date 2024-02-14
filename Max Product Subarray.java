import java.util.List;

public class Solution {

    public int maxProduct(final List<Integer> A) {
        if (A == null || A.isEmpty())
            return 0;

        int maxEndingHere = A.get(0);
        int minEndingHere = A.get(0);
        int maxProduct = A.get(0);

        for (int i = 1; i < A.size(); i++) {
            int current = A.get(i);
            int tempMax = Math.max(current, Math.max(maxEndingHere * current, minEndingHere * current));
            minEndingHere = Math.min(current, Math.min(maxEndingHere * current, minEndingHere * current));

            maxEndingHere = tempMax;

            maxProduct = Math.max(maxProduct, maxEndingHere);
        }

        return maxProduct;
    }
}
