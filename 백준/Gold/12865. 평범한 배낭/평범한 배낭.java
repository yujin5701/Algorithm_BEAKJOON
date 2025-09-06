import java.io.*;
import java.util.*;

public class Main {

    static int dp(int n, int m, int[][] arr) {
        int[][] dp = new int[n + 1][m + 1];
        // 초기값
        for (int i = 0; i < m; i++) {
            dp[0][i] = 0;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (arr[i][0] > j)
                    dp[i][j] = dp[i - 1][j];
                else {
                    dp[i][j] = Math.max(arr[i][1] + dp[i - 1][j - arr[i][0]], dp[i - 1][j]);
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n + 1][2];
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        System.out.println(dp(n, m, arr));

    }
}