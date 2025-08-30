import java.io.*;
import java.util.*;

public class Main {
    static int bfs(int start, int K, boolean[] visited) {

        Queue<Integer> q = new ArrayDeque<>();
        q.add(start); // 제일 초기 원소 큐에 삽입
        int time = 0;
        visited[start] = true;

        while (!q.isEmpty()) { // 여기서 이제 큐에 있는 거 하나씩 꺼내서 다음 이어진 거 삽입
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int now = q.poll();

                if (now == K)
                    return time;

                int[] nexts = { now - 1, now + 1, now * 2 };
                for (int next : nexts) {
                    if (next < 0 || next > 100000)
                        continue;
                    if (visited[next])
                        continue;

                    visited[next] = true;
                    q.add(next);
                }
            }
            time++;
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        boolean[] visited = new boolean[100001];

        System.out.println(bfs(N, K, visited));
    }
}