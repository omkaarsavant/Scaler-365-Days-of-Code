public class Solution {
    public int firstMissingPositive(int[] A) {
        int n = A.length;

        int shift = segregate(A, n);
        int arr2[] = new int[n - shift];
        int j = 0;
        for (int i = shift; i < n; i++) {
            arr2[j] = A[i];
            j++;
        }
        // Shift the indices
        return findMissingPositive(arr2, j);
    }

    // Utility function to swap elements i and j in array arr[]
    void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Utility function that puts all non-positive (0 and negative) numbers on left side of arr[] and return count of such numbers
    int segregate(int arr[], int size) {
        int j = 0, i;
        for (i = 0; i < size; i++) {
            if (arr[i] <= 0) {
                swap(arr, i, j);
                j++;  // increment count of non-positive integers
            }
        }
        return j;
    }

    // Find the smallest positive missing number in an array that contains all positive integers
    int findMissingPositive(int arr[], int size) {
        int i;

        // Mark arr[i] as visited by making arr[arr[i] - 1] negative. Note that 1 is subtracted because index start from 0 and positive numbers start from 1
        for (i = 0; i < size; i++) {
            if (Math.abs(arr[i]) - 1 < size && arr[Math.abs(arr[i]) - 1] > 0)
                arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
        }

        // Return the first index value at which is positive
        for (i = 0; i < size; i++)
            if (arr[i] > 0)
                return i + 1;  // 1 is added becuase indexes start from 0

        return size + 1;
    }
}
