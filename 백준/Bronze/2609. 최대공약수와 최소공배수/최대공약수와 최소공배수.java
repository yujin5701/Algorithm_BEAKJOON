import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int min = 0, max = 0;

        // 최대공약수
        for (int i = 1; i <= Math.min(a, b); i++) {
            if ((a % i == 0 && b % i == 0) && (i > max))
                max = i;
        }
        System.out.println(max);

        // 최소공배수
        min = (a * b) / max;

        System.out.println(min);
        sc.close();
    }
}