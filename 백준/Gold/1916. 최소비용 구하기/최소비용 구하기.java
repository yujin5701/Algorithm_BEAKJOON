import java.io.*;
import java.util.*;

public class Main {
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

    static List<Node>[] graph;
    static int[] cost;
    static final int INF = Integer.MAX_VALUE;

    static void dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        cost[start] = 0;
        pq.add(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node cur = pq.poll();

            if (cost[cur.v] < cur.w)
                continue;

            for (Node next : graph[cur.v]) {
                if (cost[next.v] > cost[cur.v] + next.w){
                    cost[next.v] = cost[cur.v] + next.w;
                    pq.add(new Node(next.v, cost[next.v]));
                }
                    
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        cost = new int[n + 1];
        Arrays.fill(cost, INF);

        StringTokenizer st;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            graph[u].add(new Node(v, cost));
        }

        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        dijkstra(start);
        System.out.println(cost[end]);
    }
}