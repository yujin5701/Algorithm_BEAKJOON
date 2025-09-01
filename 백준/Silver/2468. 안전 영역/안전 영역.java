import java.io.*;
import java.util.*;

public class Main {
    static int[][] map;
    static int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
    static int count;
    static boolean visited[][];

    static int bfs(int n) {
        Queue<int[]> q = new ArrayDeque<>();
        count = 0;
        for (int i = 0; i < map.length; i++) { 
            for (int j = 0; j < map.length; j++) {
                if (map[i][j] > n) {
                    if (visited[i][j] == true)
                        continue;
                    visited[i][j] = true;
                    q.add(new int[] { i, j });

                    while (!q.isEmpty()) {
                        int[] next = q.poll();
                        int x = next[0], y = next[1];
                        for (int k = 0; k < 4; k++) {
                            int nx = x + dir[k][0], ny = y + dir[k][1];
                            if (nx < 0 || ny < 0 || nx >= map.length || ny >= map.length)
                                continue;
                            if (visited[nx][ny] == true)
                                continue;
                            if (map[nx][ny] > n) {
                                q.add(new int[] { nx, ny });
                                visited[nx][ny] = true;
                            }
                        }
                    }
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        map = new int[n][n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int num = Integer.parseInt(st.nextToken());
                map[i][j] = num;
                if (num < min)
                    min = num;
                if (num > max)
                    max = num;
            }
        }
        int maxCount = 1;
        for (int i = 1; i < max; i++) {
            visited = new boolean[n][n];
            count = bfs(i);
            if (count > maxCount)
                maxCount = count;
        }
        System.out.println(maxCount);

    }
}