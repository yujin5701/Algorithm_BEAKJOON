import java.util.Scanner;

public class Main {
    public static int[] change(int[] arr, int a, int b) {
        int num = arr[a - 1];
        arr[a - 1] = arr[b - 1];
        arr[b - 1] = num;
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        int m = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr = change(arr, a, b);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();

    }
}