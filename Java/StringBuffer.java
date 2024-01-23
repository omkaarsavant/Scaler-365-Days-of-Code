import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Don't alter anything here.
        Scanner inp = new Scanner(System.in);
        String S = inp.nextLine();
        int L = inp.nextInt();
        inp.nextLine();
        int R = inp.nextInt();
        inp.nextLine();
        inp.close();
        
        System.out.println(solve(S,L,R));
        /**************************************/
    }
    
    //complete the function below
    
    public static String solve(String S, int L, int R)
    {
        // Convert the string to a character array for easy manipulation
        char[] arr = S.toCharArray();

        // Reverse the substring from index L to R
        while (L < R) {
            char temp = arr[L];
            arr[L] = arr[R];
            arr[R] = temp;
            L++;
            R--;
        }

        // Convert the character array back to a string and return
        return new String(arr);
    }
}
