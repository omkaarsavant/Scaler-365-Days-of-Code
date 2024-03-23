    
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int trap(final int[] A) {
    
        int left = 0, right = A.length - 1;
        int left_max = 0, right_max = 0;

        int result = 0;

        // Loop until left pointer is less than or equal to right pointer
        while (left <= right) {
            // If left_max is less than right_max
            if (left_max <= right_max) {
                // Update left_max
                left_max = Math.max(left_max, A[left]);
                // Add the difference between left_max and A[left] to result
                result += left_max - A[left];
                // Move left pointer to the right
                left++;
            } else {
                // Update right_max
                right_max = Math.max(right_max, A[right]);
                // Add the difference between right_max and A[right] to result
                result += right_max - A[right];
                // Move right pointer to the left
                right--;
            }
        }

        // Return result
        return result;
    }
}
