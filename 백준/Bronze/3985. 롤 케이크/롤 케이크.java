import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt(), N = sc.nextInt();
        int[] arr = new int[L], result = new int[N];
        int expect = 0, max = 0, exIndex = 0;
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            if (b - a > expect) {
                expect = b - a;
                exIndex = i + 1;
            }

            for (int j = a - 1; j <= b - 1; j++) {
                if (arr[j] != 1) {
                    arr[j] = 1;
                    result[i]++;
                }

            }
        }
        int index = 0;
        for (int i = 0; i < N; i++) {
            if (result[i] > max) {
                max = result[i];
                index = i;
            }

        }

        System.out.println(exIndex);
        System.out.println(index + 1);

        sc.close();

    }
}
