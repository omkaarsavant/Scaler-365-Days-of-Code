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
    
   public static String solve(String s, int L, int R) {
    StringBuilder str = new StringBuilder(s);
    str.replace(L, R+1, new StringBuilder(s.substring(L, R+1)).reverse().toString());
    return str.toString();
}

}
