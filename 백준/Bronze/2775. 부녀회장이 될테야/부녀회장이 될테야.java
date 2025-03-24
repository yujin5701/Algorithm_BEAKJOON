import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            int[][] arr = new int[a + 1][b + 1];

            for (int j = 1; j <= b; j++) {
                arr[0][j] = j;
            }

            for (int j = 1; j <= a; j++) {
                for (int k = 1; k <= b; k++) {
                    for (int m = 1; m <= k; m++) {
                        arr[j][k] = arr[j][k] + arr[j - 1][m];
                    }
                }
            }
            result[i] = arr[a][b];
        }
        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }

        sc.close();
    }
}