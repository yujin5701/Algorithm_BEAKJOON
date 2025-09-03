import java.io.*;
import java.util.*;

public class Main {

    public static int parametric(int[] arr, int target, int max) {
        int answer = 0, left = 1, right = max;
        while (left <= right) {
            int mid = (left + right) / 2;
            long sum = 0;
            for (int len : arr) {
                if (len > mid)
                    sum += (len - mid);
            }
            if (sum >= target) {
                left = mid + 1;
                answer = mid;

            } else {
                right = mid - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int max = 0;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            if (num > max)
                max = num;
        }

        System.out.println(parametric(arr, m, max));
    }
}