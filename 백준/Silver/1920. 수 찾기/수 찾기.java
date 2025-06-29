import java.util.*;

public class Main {
    public static int binary(List<Long> arr, long num, int start, int end) {
        while (true) {
            int mid = (start + end) / 2;
            if (start > end)
                return 0;
            if (arr.get(mid) > num) {
                return binary(arr, num, start, mid - 1);
            } else if (arr.get(mid) < num) {
                return binary(arr, num, mid + 1, end);
            } else
                return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextLong());
        }
        Collections.sort(arr);

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            System.out.println(binary(arr, sc.nextLong(), 0, n - 1));
        }
        sc.close();

    }
}