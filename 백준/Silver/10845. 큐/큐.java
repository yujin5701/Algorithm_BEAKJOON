import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            switch (s) {
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    queue.add(num);
                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        int a = queue.poll();
                        System.out.println(a);
                    }
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    if(queue.isEmpty()){
                        System.out.println(1);
                    }
                    else System.out.println(0);
                    
                    break;
                case "front":
                if(queue.isEmpty()) System.out.println(-1);
                else System.out.println(queue.peekFirst());
                    break;
                case "back":
                if(queue.isEmpty()) System.out.println(-1);
                else System.out.println(queue.peekLast());
                    break;
                default:
                    break;
            }

        }

    }
}