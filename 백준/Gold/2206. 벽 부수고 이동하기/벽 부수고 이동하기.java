import java.io.*;
import java.util.*;

// 2206번 벽 부수고 이동하기 문제 푸는 중!!
public class Main {
    static int[][] map;
    static boolean[][][] visited;
    static int[][] dir = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
    static int[][][] dist;

    static void bfs(int startX, int stratY) {
        Queue<int[]> q = new LinkedList<>();
        visited[startX][stratY][0] = true;
        q.add(new int[] { startX, stratY, 0 });
        dist = new int[map.length][map[0].length][2];
        dist[0][0][0] = 1;

        while (!q.isEmpty()) {
            int[] cur = q.poll(); // 현재 큐에 들어있는 위치 꺼냄
            for (int[] d : dir) { // 상하좌우 탐색
                int nextX = d[0] + cur[0], nextY = d[1] + cur[1]; // 다음 위치
                if (nextX >= map.length || nextY >= map[0].length ||
                        nextX < 0 || nextY < 0) // 범위 밖이면 패스
                    continue;
                if (map[nextX][nextY] == 1 && cur[2] == 0) {
                    /*
                     * 다음이 1이고, 이전에 벽을 부순 적이 없을 경우
                     * 1. 한개 벽 부수고 다음으로 이동 가능
                     */
                    if (visited[nextX][nextY][1])
                        continue;
                    dist[nextX][nextY][1] = dist[cur[0]][cur[1]][0] + 1;
                    q.add(new int[] { nextX, nextY, 1 }); // 큐에 추가
                    visited[nextX][nextY][1] = true;
                }
                if (map[nextX][nextY] == 0) {
                    if (visited[nextX][nextY][cur[2]])
                        continue;
                    q.add(new int[] { nextX, nextY, cur[2] });
                    visited[nextX][nextY][cur[2]] = true;
                    dist[nextX][nextY][cur[2]] = dist[cur[0]][cur[1]][cur[2]] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        visited = new boolean[n][m][2];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }

        bfs(0, 0);
        int result;
        if (dist[n - 1][m - 1][0] > 0 && dist[n - 1][m - 1][1] > 0) {
            result = Math.min(dist[n - 1][m - 1][0], dist[n - 1][m - 1][1]);
        } else if (dist[n - 1][m - 1][0] > 0 || dist[n - 1][m - 1][1] > 0) {
            result = Math.max(dist[n - 1][m - 1][0], dist[n - 1][m - 1][1]);
        } else
            result = -1;
        System.out.println(result);
    }
}