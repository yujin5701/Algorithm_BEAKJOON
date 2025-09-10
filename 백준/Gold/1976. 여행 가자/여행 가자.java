import java.io.*;
import java.util.*;

public class Main {

    static int[] parent;

    static int find(int a) {
        if (parent[a] == a)
            return a;
        return parent[a] = find(parent[a]);
    }

    static void union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);
        if (rootA != rootB) {
            parent[rootB] = rootA;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st;

        parent = new int[n + 1];
        for (int i = 0; i <= n; i++)
            parent[i] = i;

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (i == j)
                    continue;
                if (num == 1) {
                    union(i, j);
                }

            }
        }

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[m + 1];
        String connect = "YES";
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
        }
        for (int i = 1; i < m; i++) {
            if (find(arr[i]) != find(arr[i - 1])) {
                connect = "NO";
                break;
            }
        }
        System.out.println(connect);
    }
}
