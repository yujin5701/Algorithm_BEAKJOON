import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] r = new int[t];
        String[] str = new String[t];
        for (int i = 0; i < t; i++) {
            r[i] = sc.nextInt();
            str[i] = sc.next();

        }
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                for (int k = 0; k < r[i]; k++)
                    System.out.print(str[i].charAt(j));
            }
            System.out.println();
        }
        sc.close();
    }
}