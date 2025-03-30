import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = -1;
        int x = 0, y = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int n = sc.nextInt();
                if (n > max) {
                    max = n;
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println(max);
        System.out.print(x + " " + y);
        sc.close();

    }
}