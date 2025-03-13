import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(), y = sc.nextInt(), w = sc.nextInt(), h = sc.nextInt();
        sc.close();

        int min;
        if (x > y)
            min = y;
        else
            min = x;

        if (min > (w - x))
            min = (w - x);

        if (min > (h - y))
            min = (h - y);

        System.out.println(min);

    }
}
