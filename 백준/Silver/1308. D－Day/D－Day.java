import java.util.Scanner;

public class Main {
    public static int Year(int y) {
        int sum = 0;
        for (int i = 1; i < y; i++) {
            if ((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0)) {
                sum = sum + 366;
            } else {
                sum = sum + 365;
            }
        }
        return sum;
    }

    public static int Month(int m, int y) {
        int sum = 0;
        for (int i = 1; i < m; i++) {
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                sum = sum + 31;
            } else if (i == 2 && !((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))) {
                sum = sum + 28;
            } else if (i == 2) {
                sum = sum + 29;
            } else {
                sum = sum + 30;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y1 = sc.nextInt(), m1 = sc.nextInt(), d1 = sc.nextInt();
        int y2 = sc.nextInt(), m2 = sc.nextInt(), d2 = sc.nextInt();
        int day1 = 0, day2 = 0, sub;

        day1 = Year(y1) + Month(m1, y1) + d1;
        day2 = Year(y2) + Month(m2, y2) + d2;
        sub = day2 - day1;
        if (y2 > y1 + 1000 || (y2 == y1 + 1000 && (m2 > m1 || (m2 == m1 && d2 >= d1))))
            System.out.println("gg");
        else {
            System.out.println("D-" + sub);
        }
        sc.close();
    }
}