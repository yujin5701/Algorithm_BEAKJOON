import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int num = 1;
        for (int i = 1; i <= k; i++) {
            num = num * (n - i + 1);
        }
        for (int i = 1; i <= k; i++) {
            num = num / i;
        }
        System.out.println(num);

        sc.close();
    }
}