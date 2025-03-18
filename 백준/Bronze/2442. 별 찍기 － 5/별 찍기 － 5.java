import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int k = n - 2 - i; k >= 0; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j = j + 2) {
                System.out.print("*");
            }
            for (int j = 0; j < i * 2; j = j + 2) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}