import java.util.Scanner;

public class Main {
    public static void printR(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if (a % 10 > b % 10) {
            String s = Integer.toString(a);
            printR(s);

        } else if (a % 10 < b % 10) {
            String s = Integer.toString(b);
            printR(s);

        } else if ((a % 100) / 10 > (b % 100) / 10) {
            String s = Integer.toString(a);
            printR(s);

        } else if ((a % 100) / 10 < (b % 100) / 10) {
            String s = Integer.toString(b);
            printR(s);

        } else if (a / 100 > b / 100) {
            String s = Integer.toString(a);
            printR(s);

        } else {
            String s = Integer.toString(b);
            printR(s);

        }

        sc.close();

    }
}
