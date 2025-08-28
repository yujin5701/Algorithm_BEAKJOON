import java.io.*;
import java.util.*;

public class Main {

    static void dfs(int x, int y, int[][] map, boolean[][] visited) {
        visited[x][y] = true;
        int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
        for (int[] d : dir) {
            int nx = x + d[0], ny = y + d[1];
            if (0 <= nx && nx < map.length && 0 <= ny && ny < map[0].length) {
                if (!visited[nx][ny] && map[nx][ny] == 1) {
                    dfs(nx, ny, map, visited);
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] arr = new int[t];
        for (int l = 0; l < t; l++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int[][] map = new int[n][m];
            boolean[][] visited = new boolean[n][m];
            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[x][y] = 1;
            }
            int count = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (!visited[i][j] && map[i][j] == 1) {
                        dfs(i, j, map, visited);
                        count++;
                    }
                }
            }

            arr[l] = count;

        }
        for (int i = 0; i < t; i++) {
            System.out.println(arr[i]);
        }

    }
}