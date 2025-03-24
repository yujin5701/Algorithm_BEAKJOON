import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = -1;

        for (int i = 0; i <= n / 5; i++) {
            if ((n - i * 5) % 3 == 0) {
                min = i + (n - i * 5) / 3;
            }
        }

        System.out.println(min);

        sc.close();
    }
}