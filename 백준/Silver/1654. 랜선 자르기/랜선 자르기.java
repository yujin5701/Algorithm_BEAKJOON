import java.io.*;
import java.util.*;

public class Main {

    public static long parametric(int[] arr, int target) {

        long left = 1, right = 0;
        for(int len : arr){
            if(len > right) right = len;
        }
        long answer = 0;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long result = 0;
            for (int len : arr) {
                result += len / mid;
            }

            if (result >= target) {
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
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
        }

        bw.write(parametric(arr, n) + "\n");
        bw.flush();
    }
}