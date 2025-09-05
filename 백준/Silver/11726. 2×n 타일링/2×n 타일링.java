import java.io.*;

public class Main {

    static long dp(int n) {

        long[] dp = new long[n + 1];
        dp[1] = 1;
        if (n > 1)
            dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
        }
        return dp[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(dp(n));

    }
}