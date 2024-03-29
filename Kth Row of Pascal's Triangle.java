public class Solution {
    public int[] getRow(int A) {
        int[] row = new int[A + 1];
        row[0] = 1; 

        for (int i = 1; i <= A; i++) {
            for (int j = i; j >= 1; j--) {
                row[j] += row[j - 1];
            }
        }

        return row;
    }

    public static void main(String[] args) {
        int k = 3;
        Solution solution = new Solution();
        int[] result = solution.getRow(k);

        // Print the result
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(
