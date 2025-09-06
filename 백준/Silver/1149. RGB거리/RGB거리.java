import java.io.*;
import java.util.*;

public class Main {

    static int dp(int n, int[][] arr) {
        int[][] dp = new int[n][3];
        dp[0][0] = arr[0][0];
        dp[0][1] = arr[0][1];
        dp[0][2] = arr[0][2];

        int min = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                dp[i][j] = Math.min(dp[i - 1][(3 + j - 1) % 3], dp[i - 1][(3 + j + 1) % 3]) + arr[i][j];
            }
        }
        min = Math.min(dp[n - 1][0], dp[n - 1][1]);
        min = Math.min(min, dp[n - 1][2]);
        return min;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(dp(n, arr));

    }
}