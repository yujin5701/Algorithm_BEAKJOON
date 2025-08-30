import java.io.*;
import java.util.*;

public class Main {
    public static int left(Deque<Integer> deque, int num) {
        int count = 0;
        while (deque.peekFirst() != num) {
            deque.addLast(deque.pollFirst());
            count++;
        }
        deque.pollFirst();
        return count;
    }

    public static int right(Deque<Integer> deque, int num) {
        int count = 0;
        while (deque.peekFirst() != num) {
            deque.addFirst(deque.pollLast());
            count++;
        }
        deque.pollFirst();
        return count;
    }

    public static int compair(Deque<Integer> deque, int num) {
        Deque<Integer> dq1 = new ArrayDeque<>(deque), dq2 = new ArrayDeque<>(deque);
        int l = left(dq1, num);
        int r = right(dq2, num);
        if (l > r)
            return right(deque, num);
        else {
            return left(deque, num);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());


        Deque<Integer> dq = new ArrayDeque<>();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            dq.addLast(i);
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            count += compair(dq, num);
        }
        System.out.println(count);
    }
}