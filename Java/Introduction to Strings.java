import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String B = scanner.next();
        scanner.close();
 
        System.out.println(A.length() + B.length());
        
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        
        System.out.println(A.toUpperCase() + " " + B.toUpperCase());
    }
}
