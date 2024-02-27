public class Solution {
    public int numTrees(int A) {
       
        int[] count = new int[A + 1];
        count[0] = 1;  
 
        for (int i = 1; i <= A; i++) {
            for (int j = 0; j < i; j++) {
                count[i] += count[j] * count[i - j - 1];
            }
        }

        return count[A];
    }
}
