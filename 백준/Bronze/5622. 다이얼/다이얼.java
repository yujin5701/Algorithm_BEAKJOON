import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch <= 'C') {
                sum = sum + 3;
            } else if (ch <= 'F') {
                sum = sum + 4;
            } else if (ch <= 'I') {
                sum = sum + 5;
            } else if (ch <= 'L') {
                sum = sum + 6;
            } else if (ch <= 'O') {
                sum = sum + 7;
            } else if (ch <= 'S') {
                sum = sum + 8;
            } else if (ch <= 'V') {
                sum = sum + 9;
            } else {
                sum = sum + 10;
            }
        }
        System.out.println(sum);
        sc.close();

    }
}