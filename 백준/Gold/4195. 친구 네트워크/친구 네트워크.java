import java.io.*;
import java.util.*;

public class Main {
    static int[] parent;
    static int[] size;

    static int find(int x) {
        if (parent[x] == x)
            return x;
        return parent[x] = find(parent[x]);
    }

    static void union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);
        if (rootA != rootB) {
            parent[rootB] = rootA;
            size[rootA] += size[rootB];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            HashMap<String, Integer> map = new HashMap<>();
            StringTokenizer st;
            parent = new int[2 * m + 1];
            int idx = 0;
            size = new int[2 * m + 1];

            for (int j = 0; j < m; j++) {
                st = new StringTokenizer(br.readLine());
                String s1 = st.nextToken();
                String s2 = st.nextToken();

                if (!map.containsKey(s1)) {
                    map.put(s1, idx);
                    parent[idx] = idx;
                    size[idx++] = 1;
                }

                if (!map.containsKey(s2)) {
                    map.put(s2, idx);
                    parent[idx] = idx;
                    size[idx++] = 1;
                }
                union(map.get(s1), map.get(s2));

                System.out.println(size[find(map.get(s1))]);
            }
        }
    }
}
