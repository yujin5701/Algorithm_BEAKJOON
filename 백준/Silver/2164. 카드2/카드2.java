import java.util.*;

public class Main {
    public static int makeQueue(int num) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < num; i++) {
            q.add(i + 1);
        }
        while (q.size() > 1) {
            int a = q.poll();
            int b = q.poll();
            q.offer(b);
        }
        return q.poll();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(makeQueue(n));
        sc.close();
    }
}