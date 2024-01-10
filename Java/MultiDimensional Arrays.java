import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[] res = new int[m]; 
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                res[j] += arr[i][j];
            }
        }

        for (int k = 0; k < m; k++) {
            System.out.print(res[k]+" ");
        }
    }
}
