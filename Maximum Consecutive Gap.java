import java.util.*;

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maximumGap(final int[] A) {
        if (A == null || A.length < 2) {
            return 0;
        }

        int min = A[0];
        int max = A[0];
        for (int num : A) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int gap = (int) Math.ceil((double) (max - min) / (A.length - 1));
        int[] minBucket = new int[A.length - 1];
        int[] maxBucket = new int[A.length - 1];
        Arrays.fill(minBucket, Integer.MAX_VALUE);
        Arrays.fill(maxBucket, Integer.MIN_VALUE);

        for (int num : A) {
            if (num == min || num == max) {
                continue;
            }
            int idx = (num - min) / gap;
            minBucket[idx] = Math.min(num, minBucket[idx]);
            maxBucket[idx] = Math.max(num, maxBucket[idx]);
        }

        int maxGap = Integer.MIN_VALUE;
        int previous = min;
        for (int i = 0; i < A.length - 1; i++) {
            if (minBucket[i] == Integer.MAX_VALUE && maxBucket[i] == Integer.MIN_VALUE) {
                // empty bucket
                continue;
            }
            maxGap = Math.max(maxGap, minBucket[i] - previous);
            previous = maxBucket[i];
        }
        maxGap = Math.max(maxGap, max - previous); // update the final max value gap
        return maxGap;
    }
}
