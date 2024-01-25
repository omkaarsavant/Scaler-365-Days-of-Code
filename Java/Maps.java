import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int marks = sc.nextInt();
            map.put(name, marks);
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            String query = sc.next();
            if (map.containsKey(query)) {
                System.out.println(map.get(query));
            } else {
                System.out.println("Not Found");
            }
        }
    }
}
