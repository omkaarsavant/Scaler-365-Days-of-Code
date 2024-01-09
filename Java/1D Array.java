import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        int[] arr = new int[100];
        
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        for(int i=n-1;i<=arr.length && i>=0;i--)
        {
            System.out.println(arr[i]);

        }      
    }
}
