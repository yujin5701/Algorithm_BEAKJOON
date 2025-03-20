import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt(), count = 0;
        int[] shirts = new int[6];

        for (int i = 0; i < 6; i++) {
            shirts[i] = sc.nextInt();
        }
        int t = sc.nextInt(), p = sc.nextInt();
        for (int i = 0; i < 6; i++) {
            if (shirts[i] % t == 0)
                count = count + (shirts[i] / t);
            else
                count = count + (shirts[i] / t + 1);
        }
        System.out.println(count);
        System.out.print(people / p + " ");
        System.out.println(people % p);

        sc.close();
    }
}