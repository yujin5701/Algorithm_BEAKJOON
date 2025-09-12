import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> str = new HashMap<>();
        HashMap<Integer, String> inte = new HashMap<>();

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            String s = br.readLine();
            str.put(s, i);
            inte.put(i, s);
        }

        for (int i = 1; i <= m; i++) {
            String s = br.readLine();
            if (!Character.isDigit(s.charAt(0))) {
                sb.append(str.get(s)).append("\n");
            } else {
                sb.append(inte.get(Integer.parseInt(s))).append("\n");
            }
        }
        System.out.println(sb);
    }
}