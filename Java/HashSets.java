import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        HashSet<Integer> uniqueElements = new HashSet<>();
        for (int i = 0; i < N; i++) {
            uniqueElements.add(scanner.nextInt());
        }
        System.out.println(uniqueElements.size());
    }
}
