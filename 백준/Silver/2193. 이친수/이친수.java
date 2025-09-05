import java.io.*;

public class Main {

    static long dp(int n) {
        long[][] dp = new long[n + 1][2];
        dp[1][1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i][1] = dp[i - 1][0];
            dp[i][0] = dp[i - 1][0] + dp[i - 1][1];
        }

        return dp[n][1] + dp[n][0];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(dp(n));
    }
}