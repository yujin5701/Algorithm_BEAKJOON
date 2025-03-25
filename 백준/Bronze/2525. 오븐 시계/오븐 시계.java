import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), m = sc.nextInt(), time = sc.nextInt();

        m = m + time % 60;
        h = h + time / 60;

        if (m >= 60) {
            m = m - 60;
            h++;
        }
        if (h >= 24) {
            h = h - 24;
        }

        System.out.print(h + " " + m);

        sc.close();
    }
}