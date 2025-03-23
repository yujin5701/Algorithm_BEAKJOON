import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] six = new int[m];
        int[] one = new int[m];
        int Smin = Integer.MAX_VALUE, Omin = Integer.MAX_VALUE, sum;
        for (int i = 0; i < m; i++) {
            six[i] = sc.nextInt();
            one[i] = sc.nextInt();
            if (Smin > six[i])
                Smin = six[i];
            if (Omin > one[i])
                Omin = one[i];
        }

        if (Smin > Omin * 6)
            Smin = Omin * 6;
        sum = Math.min((n / 6) * Smin + (n % 6) * Omin, (n / 6 + 1) * Smin);
        System.out.println(sum);

        sc.close();

    }
}