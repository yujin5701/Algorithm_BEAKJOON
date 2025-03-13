import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int[] res = new int[test];

        for (int i = 0; i < test; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();

            int dx = x1 - x2;
            int dy = y1 - y2;
            int dis = dx * dx + dy * dy;
            int sum = r1 + r2;
            int diffr = Math.abs(r1 - r2);
            int sumS = sum * sum;
            int diffrS = diffr * diffr;

            if (dis == 0 && r1 == r2)
                res[i] = -1;
            else if (dis > sumS)
                res[i] = 0;
            else if (dis < diffrS)
                res[i] = 0;
            else if ((dis == sumS) || (dis == diffrS))
                res[i] = 1;
            else
                res[i] = 2;

        }
        for (int i = 0; i < test; i++) {
            System.out.println(res[i]);
        }

        sc.close();
    }
}