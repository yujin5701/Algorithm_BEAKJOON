import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a == b && b == c) {
            sum = 10000 + 1000 * a;
        } else if (a == b && a != c) {
            sum = 1000 + 100 * a;
        } else if (a == c && a != b) {
            sum = 1000 + 100 * a;
        } else if (c == b && a != c) {
            sum = 1000 + 100 * b;
        } else {
            int max = 0;
            if (max < a)
                max = a;
            if (max < b)
                max = b;
            if (max < c)
                max = c;
            sum = 100 * max;
        }
        System.out.println(sum);
        sc.close();

    }
}