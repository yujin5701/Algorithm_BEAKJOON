import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long a = sc.nextLong(), b = sc.nextLong();
        System.out.println(Math.abs(a - b));

        sc.close();
    }
}
