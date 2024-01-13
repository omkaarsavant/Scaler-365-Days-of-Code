import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int Q = scanner.nextInt();
        for (int i = 0; i < Q; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            switch (x) {
                case 1:
                    queue.add(y);
                    break;
                case 2:
                    System.out.println(queue.isEmpty() ? -1 : queue.peek());
                    break;
                case 3:
                    if (!queue.isEmpty()) {
                        queue.poll();
                    }
                    break;
            }
        }
        scanner.close();
    }
}
