import java.lang.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> positiveIntegers = new ArrayList<>();

        // Read input until a negative integer is encountered
        while (true) {
            int num = scanner.nextInt();
            if (num < 0) {
                break; // Exit the loop when a negative integer is encountered
            }
            positiveIntegers.add(num);
        }

        // Print the positive integers in reverse order
        for (int i = positiveIntegers.size() - 1; i >= 0; i--) {
            System.out.print(positiveIntegers.get(i) + " ");
        }
    }
}
