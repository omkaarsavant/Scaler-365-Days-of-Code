public class Solution {
    public int[] sieve(int A) {
        boolean[] isPrime = new boolean[A + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= A; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= A; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        List<Integer> primesList = new ArrayList<>();
        for (int i = 2; i <= A; i++) {
            if (isPrime[i]) {
                primesList.add(i);
            }
        }

        // Convert List to array
        int[] primesArray = new int[primesList.size()];
        for (int i = 0; i < primesList.size(); i++) {
            primesArray[i] = primesList.get(i);
        }

        return primesArray;
    }
}
