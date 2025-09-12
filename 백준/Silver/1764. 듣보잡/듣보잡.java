import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String s;
        HashMap<String, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            s = br.readLine();
            map.put(s, s);
        }
        for (int i = 0; i < m; i++) {
            s = br.readLine();
            if (map.containsKey(s))
                list.add(s);
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        sb.append(list.size()).append("\n");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}
