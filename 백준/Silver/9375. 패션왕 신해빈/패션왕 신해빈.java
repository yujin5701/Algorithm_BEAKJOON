import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int l = 0; l < k; l++) {
            int n = Integer.parseInt(br.readLine());

            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String s1 = st.nextToken();
                String s2 = st.nextToken();
                map.put(s2, map.getOrDefault(s2, 0) + 1);
            }

            int sum = 1;
            for (String key : map.keySet()) {
                sum = (map.getOrDefault(key, 0) + 1) * sum;
            }
            sb.append(sum - 1).append("\n");
        }

        System.out.println(sb);

    }
}