import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            sum = sum + (int) ch - 48;
        }
        System.out.println(sum);
    }
}