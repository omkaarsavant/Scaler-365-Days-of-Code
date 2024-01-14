import java.lang.*;
import java.util.*;

public class Main {
     public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        int Q = scanner.nextInt();
        for (int i = 0; i < Q; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            switch (x) {
                case 1:
                    deque.addLast(y);
                    break;
                case 2:
                    deque.addFirst(y);
                    break;
                case 3:
                    System.out.println(deque.isEmpty() ? -1 : deque.getFirst());
                    break;
                case 4:
                    System.out.println(deque.isEmpty() ? -1 : deque.getLast());
                    break;
                case 5:
                    if (!deque.isEmpty()) {
                        deque.removeFirst();
                    }
                    break;
                case 6:
                    if (!deque.isEmpty()) {
                        deque.removeLast();
                    }
                    break;
            }
        }
        scanner.close();
    }
}
