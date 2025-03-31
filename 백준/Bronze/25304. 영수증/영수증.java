import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt(), count = sc.nextInt();
        int n = 0;
        for (int i = 0; i < count; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            n += a * b;
        }
        if (sum == n)
            System.out.println("Yes");
        else
            System.out.println("No");

        sc.close();

    }
}
