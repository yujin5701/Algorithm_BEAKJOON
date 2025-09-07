import java.io.*;
import java.util.*;

public class Main {

    static int dp(int n, int k, List<Integer> coin) {
        int dp[] = new int[k + 1];
        dp[0] = 0;
        for (int i = 1; i <= k; i++) {
            dp[i] = Integer.MAX_VALUE / 2;
        }

        for (int i = 1; i <= k; i++) {
            for (int j = 0; j < n; j++) {
                if ((i - coin.get(j)) >= 0) {
                    dp[i] = Math.min(dp[i - coin.get(j)] + 1, dp[i]);
                } else {
                }
            }
        }

        if (dp[k] > k)
            return -1;
        return dp[k];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        List<Integer> coin = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            coin.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(coin);

        System.out.println(dp(n, k, coin));
    }
}