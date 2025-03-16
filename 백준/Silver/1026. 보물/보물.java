import java.util.Scanner;

public class Main {
    public static void sortDown(int[] arr, int length) {
        int i = 0;

        while (true) {
            Boolean end = true;
            for (i = 0; i < length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    int e = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = e;
                    end = false;
                }
            }
            if (end == true)
                break;
        }
    }

    public static void sortUp(int[] arr, int length) {
        int i = 0;

        while (true) {
            Boolean end = true;
            for (i = 0; i < length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int e = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = e;
                    end = false;
                }
            }
            if (end == true)
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), sum = 0;
        int[] A = new int[N], B = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }

        // A를 큰 순으로 정렬
        sortDown(A, A.length);

        // B를 작은 순으로 정렬
        sortUp(B, B.length);

        for (int i = 0; i < N; i++) {
            A[i] = A[i] * B[i];
        }
        for (int i = 0; i < N; i++) {
            sum = sum + A[i];
        }
        System.out.println(sum);

        sc.close();
    }
}