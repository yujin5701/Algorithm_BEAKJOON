import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), count = 0;
        while (true) {
            if (x == 0)
                break;
            if (x % 2 == 1) {
                x--;
                x = x / 2;
                count++;
            } else
                x = x / 2;

        }
        System.out.println(count);
        sc.close();

    }
}