import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();

        List<String> list = new ArrayList<>();
        double sum = 0;
        String s;
        while ((s = br.readLine()) != null) {
            if (s.isEmpty()) continue;
            map.put(s, map.getOrDefault(s, 0) + 1);
            sum++;
        }
        for (String key : map.keySet()) {
            list.add(key);
        }
        Collections.sort(list);
        for (String key : list) {
            System.out.printf("%s %.4f\n", key, map.get(key) / sum * 100.0);
        }

    }
}