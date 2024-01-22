import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        
        System.out.println(A.substring(L, R + 1));
    }
}
