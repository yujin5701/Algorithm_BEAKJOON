import java.util.Scanner;

public class Main {
    public static int wb(String[] arr, int n, int m) {
        int countW = 0;
        for (int i = n; i < n+8; i++) {
            String s = arr[i];
            if ((i - n) % 2 == 0) {
                for (int j = m; j < m+8; j++) {
                    if (( (j - m) % 2 == 0 && s.charAt(j) == 'B') || ( (j - m) % 2 == 1 && s.charAt(j) == 'W'))
                        countW++;
                }
            }
            if ((i - n) % 2 == 1) {
                for (int j = m; j < m+8; j++) {
                    if (( (j - m) % 2 == 0 && s.charAt(j) == 'W') || ( (j - m) % 2 == 1 && s.charAt(j) == 'B'))
                        countW++;
                }
            }
        }
        return countW;
    }

    public static int bw(String[] arr, int n, int m) {
        int countB = 0;
        for (int i = n; i < n+8; i++) {
            String s = arr[i];
            if ((i - n) % 2 == 1) {
                for (int j = m; j < m+8; j++) {
                    if (( (j - m) % 2 == 0 && s.charAt(j) == 'B') || ( (j - m) % 2 == 1 && s.charAt(j) == 'W'))
                        countB++;
                }
            }
            if ((i - n) % 2 == 0) {
                for (int j = m; j < m+8; j++) {
                    if (( (j - m) % 2 == 0 && s.charAt(j) == 'W') || ( (j - m) % 2 == 1 && s.charAt(j) == 'B'))
                        countB++;
                }
            }
        }
        return countB;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();

        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next(); // 문자열 입력 받음
        }

        int min = Integer.MAX_VALUE;
        // 8 x 8부터 시작. 
        for (int i = 0; i < n-7; i++) {
            for (int j = 0; j < m-7; j++) {
                int w = wb(s, i, j), b = bw(s, i, j);
                min = Math.min(min, Math.min(w, b));
            }
        }
        System.out.println(min);

    }
}