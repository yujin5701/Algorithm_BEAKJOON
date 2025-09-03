import java.io.*;
import java.util.*;

public class Main {
    public static int lowerBound(List<Integer> list, int target){
        int left = 0, right = list.size();
        while (left < right) {
            int mid = (left + right) / 2;
            if(list.get(mid) < target) left = mid + 1;
            else right = mid;
        }
        return left;
    }

    public static int upperBound(List<Integer> list, int targer){
        int left = 0, right = list.size();
        while (left < right) {
            int mid = (left + right) / 2;
            if(list.get(mid) <= targer) left = mid + 1;
            else right = mid;
        }
        return left;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);

        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int x = Integer.parseInt(st.nextToken());
            sb.append(upperBound(list, x) - lowerBound(list, x)).append(" ");
        }
        System.out.println(sb);
    }
}