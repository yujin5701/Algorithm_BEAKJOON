import java.io.*;
import java.util.*;


public class Main {
    static int dfs(int x, int y, int[][] map, boolean[][] visited, int count) {
        visited[x][y] = true;
        int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
        for (int[] d : dir) {
            int nx = x + d[0], ny = y + d[1];
            if (0 <= nx && nx < map.length && 0 <= ny && ny < map[0].length) {
                if (map[nx][ny] == 0 && !visited[nx][ny]) {
                    count++;
                    count = dfs(nx, ny, map, visited, count);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][m];
        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            for (int j = x1; j < x2; j++) {
                for (int l = y1; l < y2; l++) {
                    map[l][j] = 1;
                }
            }
        }
        List<Integer> list = new ArrayList<>();

        int total = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && map[i][j] == 0) {
                    int count = 1;
                    count = dfs(i, j, map, visited, count);
                    list.add(count);
                    total++;
                }
            }
        }
        Collections.sort(list);
        System.out.println(total);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}