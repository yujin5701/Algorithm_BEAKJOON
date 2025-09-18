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
        public int compareTo(Node o) {
            return this.w - o.w;
        }
    }

    static List<Node>[] graph;
    static int INF = Integer.MAX_VALUE;
    static int[] dist;
    static int n;
    static boolean exist;

    static int dijkstra(int start, int end) {
        PriorityQueue<Node> pq = new PriorityQueue<>();

        dist = new int[n + 1];

        Arrays.fill(dist, INF);
        dist[start] = 0;
        pq.add(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node cur = pq.poll();
            if (dist[cur.v] < cur.w)
                continue;
            for (Node next : graph[cur.v]) {
                if (dist[next.v] > dist[cur.v] + next.w) {
                    dist[next.v] = dist[cur.v] + next.w;
                    pq.add(new Node(next.v, dist[next.v]));
                }
            }
        }
        if (dist[end] == INF)
            exist = false;
        return dist[end];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph[u].add(new Node(v, w));
            graph[v].add(new Node(u, w));
        }

        st = new StringTokenizer(br.readLine());
        int node1 = Integer.parseInt(st.nextToken());
        int node2 = Integer.parseInt(st.nextToken());
        exist = true;
        int first = dijkstra(1, node1) + dijkstra(node1, node2) + dijkstra(node2, n);
        boolean first_exist = exist;
        exist = true;
        int second = dijkstra(1, node2) + dijkstra(node2, node1) + dijkstra(node1, n);
        boolean second_exist = exist;
        if(first_exist == false && second_exist == false) System.out.println(-1);
        else if(first_exist == false) System.out.println(second);
        else if(second_exist == false) System.out.println(first);
        else System.out.println(Math.min(first, second));
    }
}