import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int dp(int n, int[][] arr) {
        int[][] dp = new int[n][n];
        dp[0][0] = arr[0][0];
        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i - 1][0] + arr[i][0];
            for (int j = 1; j <= i; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - 1]) + arr[i][j];
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (dp[n - 1][i] > max)
                max = dp[n - 1][i];
        }

        return max;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j <= i; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(dp(n, arr));

    }
}