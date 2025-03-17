import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        long[] count = new long[T];

        for (int j = 0; j < T; j++) {
            int a = sc.nextInt(), b = sc.nextInt();
            long c = 1;

            for (int i = 0; i < a; i++) {
                c = c * (b - i) / (i + 1);
            }
            count[j] = c;
        }
        for (int i = 0; i < T; i++) {
            System.out.println(count[i]);
        }
        sc.close();
    }
}