import java.io.*;
import java.util.*;

public class Main {
    static int N, M, X;
    static final int INF = Integer.MAX_VALUE;
    static List<Node>[] graph;
    static int[] dist;

    static class Node implements Comparable<Node> {
        int v, w;

        Node(int v, int w) {
            this.v = v;
            this.w = w;
        }

        @Override
        public int compareTo(Main.Node o) {
            return this.w - o.w;
        }
    }

    static int dijkstra(int start, int x) {
        dist = new int[N + 1];
        Arrays.fill(dist, INF);
        dist[start] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start, 0)); // 제일 첫 노드

        while (!pq.isEmpty()) {
            Node cur = pq.poll();
            if (dist[cur.v] < cur.w)
                continue; // 이미 더 작은 값이면 패스

            for (Node next : graph[cur.v]) {
                if (dist[next.v] > dist[cur.v] + next.w) {
                    dist[next.v] = dist[cur.v] + next.w;
                    pq.add(new Node(next.v, dist[next.v]));
                }
            }
        }
        return dist[x];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        int maximum = Integer.MIN_VALUE;

        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        dist = new int[N + 1];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph[u].add(new Node(v, w));
        }
        for (int i = 1; i <= N; i++) { // N명의 학생이 왕복 몇시간 걸리는지?
            maximum = Math.max(maximum, dijkstra(i, X) + dijkstra(X, i));
        }
        System.out.println(maximum);
    }
}