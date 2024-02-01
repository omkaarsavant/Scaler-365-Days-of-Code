import java.util.*;

class Pair implements Comparable<Pair> {
    int first;
    int second;

    public Pair(int a, int b) {
        this.first = a;
        this.second = b;
    }

    @Override
    public int compareTo(Pair p) {
        if (this.second == p.second) {
            return p.first - this.first;
        } else {
            return p.second - this.second;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Pair> arr = new ArrayList<Pair>();
        int n = in.nextInt();
        in.nextLine();
        for(int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            arr.add(new Pair(a, b));
            in.nextLine();
        }
        in.close();
        Collections.sort(arr);
        for(int i = 0; i < n; i++) {
            System.out.println(arr.get(i).first + " " + arr.get(i).second);
        }
    }
}
