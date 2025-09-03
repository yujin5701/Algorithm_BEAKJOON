import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static int lowerBound(List<Integer> list, int target) {
        int left = 0, right = list.size();
        while (left < right) {
            int mid = (left + right) / 2;
            if (list.get(mid) < target)
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>(), list2 = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            list.add(num);
            list2.add(num);
        }
        list = list.stream().distinct().collect(Collectors.toList());

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list2.size(); i++) {
            sb.append(lowerBound(list, list2.get(i))).append(" ");
        }
        System.out.println(sb);
    }
}