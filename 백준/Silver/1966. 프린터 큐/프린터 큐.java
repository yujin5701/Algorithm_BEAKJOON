import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int l = 0; l < t; l++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken()); 
            
            List<Integer> list = new ArrayList<>();
            Queue<Integer> queue = new ArrayDeque<>();
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(st.nextToken());
                list.add(num);
                queue.add(num);
            }
            Collections.sort(list);
            int count = 0;
            while (true) {
                int top = queue.peek();
                if (n == 1) {
                    count++;
                    break;
                }

                if (list.get(list.size() - 1) == top) { // 현재 top이 제일 크면 삭제
                    list.remove(list.size() - 1);
                    queue.poll();
                    count++;
                    if (m == 0)
                        break;
                    else {
                        m--;
                    }

                } else { // 뒤에 더 큰 거 있으면 top 맨 뒤로 보내기
                    queue.add(queue.remove());
                    if (m == 0)
                        m = list.size() - 1;
                    else
                        m--;
                }

            }
            System.out.println(count);
        }
    }
}