public class Solution {
    public int canJump(int[] A) {
        int lastGoodIndex = A.length - 1;
        for (int i = A.length - 1; i >= 0; i--) {
            if (i + A[i] >= lastGoodIndex) {
                lastGoodIndex = i;
            }
        }
        return lastGoodIndex == 0 ? 1 : 0;
    }
}
