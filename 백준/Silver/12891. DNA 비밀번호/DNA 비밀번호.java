import java.io.*;
import java.util.*;

public class Main {
    static int idx(char c) {
        if (c == 'A')
            return 0;
        if (c == 'C')
            return 1;
        if (c == 'G')
            return 2;
        return 3;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        String string = br.readLine();
        int[] count = new int[4];
        int result = 0;

        st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < p; i++) {
            int Ac = 0, Cc = 0, Gc = 0, Tc = 0;
            count[idx(string.charAt(i))]++;
        }
        if (count[0] >= A && count[1] >= C && count[2] >= G && count[3] >= T)
            result++;

        for (int i = 0; i < s - p; i++) {
            count[idx(string.charAt(i))]--;
            count[idx(string.charAt(i + p))]++;
            if (count[0] >= A && count[1] >= C && count[2] >= G && count[3] >= T)
                result++;
        }
        System.out.println(result);

    }
}