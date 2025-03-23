import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] burger = new int[3];
        int[] drink = new int[2];
        int Bmin = Integer.MAX_VALUE, Dmin = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            burger[i] = sc.nextInt();
            if (burger[i] < Bmin)
                Bmin = burger[i];
        }
        for (int i = 0; i < 2; i++) {
            drink[i] = sc.nextInt();
            if (drink[i] < Dmin)
                Dmin = drink[i];
        }

        System.out.println(Bmin + Dmin - 50);

        sc.close();

    }
}