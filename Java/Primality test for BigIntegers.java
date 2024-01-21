import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        scanner.close();

        BigInteger bigInteger = new BigInteger(n);
        boolean probablePrime = bigInteger.isProbablePrime(1);

        if (probablePrime) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
