import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char ch = s.charAt(0);
        System.out.println((int) ch);

        sc.close();

    }
}