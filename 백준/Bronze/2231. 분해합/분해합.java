import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);
        // 두자릿수라면 어디부터 세어야 할까?
        // n자릿수라면 n - 9 * n 뺀 수부터 확인하면 됨.
        int count = n - s.length() * 9;
        int gen = 0;
        for (int i = count; i < n; i++) {
            int sum = 0, div = 1;
            while (div < i) {
                sum = sum + (i % (div * 10) / div);
                div = div * 10;
            }
            if (sum + i == n) {
                gen = i;
                break;
            }
        }
        System.out.println(gen);
        sc.close();

    }
}
