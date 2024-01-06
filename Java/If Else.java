import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        /***Don't change the code here***/
        
        Scanner inp  = new Scanner(System.in);
        int m = inp.nextInt();
        inp.close();
        if(m%3==0 && m%5==0)
        {
            System.out.println("Good Number");
        }
        else if(m%3==0)
        {
            System.out.println("Bad Number");
        }
        else if(m%5==0)
        {
            System.out.println("Poor Number");
        }
        else
        {
             System.out.println("-1");
        }  
        
    }
}
