import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {

    /*
     * Complete the 'getDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. String day
     *  2. String month
     *  3. String year
     */
      
    public static String getDay(String day, String month, String year) {
        int y = Integer.parseInt(year);
        int m = Integer.parseInt(month);
        int d = Integer.parseInt(day);

        LocalDate date = LocalDate.of(y, m, d);
        return date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.US).toUpperCase();
    }
    public static void main(String[] args) {
        
        /****don't alter the code below*************************************/
        
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
        
        /****************************************************/
        
    }
}
