import java.io.*;

public class Main {

    static long dp(int n) {

        long[] dp = new long[n + 1];
        dp[1] = 1;
        if (n > 1)
            dp[2] = 1;
        if (n > 2)
            dp[3] = 1;
        if (n > 3)
            dp[4] = 2;
        if (n > 4)
            dp[5] = 2;
        for (int i = 6; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 5];
        }
        return dp[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(dp(Integer.parseInt(br.readLine()))).append("\n");
        }
        System.out.println(sb);

    }
}