public class Solution {
    public int maxSubArray(final int[] A) {
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;

        for (int num : A) {
            maxEndingHere += num;
            maxSoFar = Math.max(maxSoFar, maxEndingHere);

            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
        }

        return maxSoFar;
    }

    // Example usage
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A1 = {1, 2, 3, 4, -10};
        int[] A2 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println(solution.maxSubArray(A1)); // Output: 10
        System.out.println(solution.maxSubArray(A2)); // Output: 6
    }
}

