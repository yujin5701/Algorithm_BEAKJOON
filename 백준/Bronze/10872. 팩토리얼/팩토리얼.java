import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0)
            n = 1;
        for (int i = n - 1; i >= 1; i--) {
            n *= i;
        }

        System.out.println(n);
        sc.close();
    }
}