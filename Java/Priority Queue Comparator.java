import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        int Q = sc.nextInt();
        for (int i = 0; i < Q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x == 1) {
                pq.add(y);
            } else if (x == 2) {
                if (pq.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(pq.peek());
                }
            } else if (x == 3) {
                if (!pq.isEmpty()) {
                    pq.poll();
                }
            }
        }
        sc.close();
    }
}
