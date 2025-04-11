import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int sum = 0, a = 0, b = 0;
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i != j && (sum - arr[i] - arr[j]) == 100) {
                    a = i;
                    b = j;
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            if (i != a && i != b)
                System.out.println(arr[i]);
        }
        sc.close();
    }
}
