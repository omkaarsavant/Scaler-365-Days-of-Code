public class Solution {
    public int canCompleteCircuit(final int[] A, final int[] B) {
        int totalFuel = 0;
        int remainingFuel = 0;
        int start = 0;

        for (int i = 0; i < A.length; i++) {
            totalFuel += A[i] - B[i];
            remainingFuel += A[i] - B[i];

            if (remainingFuel < 0) {
                start = i + 1;
                remainingFuel = 0;
            }
        }

        return (totalFuel < 0) ? -1 : start;
    }
}
