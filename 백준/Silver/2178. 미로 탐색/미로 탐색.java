import java.io.*;
import java.util.*;

public class Main {
    static void bfs(int[][] map, boolean[][] visited, int[][] dist, int startx, int starty, int N, int M) {
        int[][] d = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

        visited[startx][starty] = true;
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[] { startx, starty });
        dist[startx][starty] = 1;

        while (!q.isEmpty()) {
            int[] c = q.poll();
            int x = c[0], y = c[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + d[i][0], ny = y + d[i][1];
                if (nx < 0 || nx >= N || ny < 0 || ny >= M)
                    continue;
                if (visited[nx][ny])
                    continue;
                if (map[nx][ny] == 0)
                    continue;

                visited[nx][ny] = true;
                q.add(new int[] { nx, ny });
                dist[nx][ny] = dist[x][y] + 1;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] map = new int[N][M];
        boolean[][] visited = new boolean[N][M];
        int[][] dist = new int[N][M];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }

        bfs(map, visited, dist, 0, 0, N, M);
        System.out.println(dist[N - 1][M - 1]);
    }
}