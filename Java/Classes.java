import java.lang.*;
import java.util.*;


class Pair {
    int first;
    int second;
    
    public Pair() {
        this.first = 10;
        this.second = 20;
    }
}

public class Main {
    public static void main(String[] args) {
    
    /**Don't alter the code below***************/
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        inp.nextLine();
        int b = inp.nextInt();
        inp.close();
        
        Pair obj  = new Pair(); // Use the Pair class
        System.out.println(obj.first + obj.second);
        
        System.out.println(a*obj.first);
        
        System.out.println(b*obj.second);
        
        
    /*************************************************/
    }
}
