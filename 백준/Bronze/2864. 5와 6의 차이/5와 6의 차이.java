import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), b = sc.next();

        String maxA = a.replace('5', '6'),
                minA = a.replace('6', '5'),
                maxB = b.replace('5', '6'),
                minB = b.replace('6', '5');

        int max = Integer.parseInt(maxA) + Integer.parseInt(maxB);
        int min = Integer.parseInt(minA) + Integer.parseInt(minB);
        System.out.println(min + " " + max);
        sc.close();

    }
}
