import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();
        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int a;
            switch (s) {
                case "push_front":
                    a = Integer.parseInt(st.nextToken());
                    dq.addFirst(a);
                    break;
                case "push_back":
                    a = Integer.parseInt(st.nextToken());
                    dq.addLast(a);
                    break;
                case "pop_front":
                    if (dq.isEmpty())
                        System.out.println(-1);
                    else
                        System.out.println(dq.pollFirst());
                    break;
                case "pop_back":
                    if (dq.isEmpty())
                        System.out.println(-1);
                    else
                        System.out.println(dq.pollLast());
                    break;
                case "size":
                    System.out.println(dq.size());

                    break;
                case "empty":
                    if (dq.isEmpty())
                        System.out.println(1);
                    else
                        System.out.println(0);
                    break;
                case "front":
                    if (dq.isEmpty())
                        System.out.println(-1);
                    else
                        System.out.println(dq.getFirst());
                    break;
                case "back":
                    if (dq.isEmpty())
                        System.out.println(-1);
                    else
                        System.out.println(dq.getLast());
                    break;
                default:
                    break;
            }
        }

    }
}