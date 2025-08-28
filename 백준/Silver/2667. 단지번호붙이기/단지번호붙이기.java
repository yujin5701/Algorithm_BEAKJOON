import java.io.*;
import java.util.*;

public class Main {
    static int dfs(int x, int y, int[][] map, boolean visited[][], int count) {
        int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } }; // 상하좌우
        visited[x][y] = true;
        for (int[] d : dir) {
            int nx = x + d[0], ny = y + d[1];
            if (0 <= nx && nx < map.length && 0 <= ny && ny < map[0].length) {
                if (map[nx][ny] == 1 && !visited[nx][ny]) {
                    count++;
                    count = dfs(nx, ny, map, visited, count);
                }
            }
        }
        return count;

    }

    public static void main(String[] agrs) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];
        boolean visited[][] = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }

        List<Integer> list = new ArrayList<>();
        int total = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1 && visited[i][j] == false) {
                    total++;
                    int count = 1;
                    count = dfs(i, j, map, visited, count);
                    list.add(count);
                }
            }
        }
        System.out.println(total);
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    
}