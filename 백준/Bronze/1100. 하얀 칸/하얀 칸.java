import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 8; i++) {
            String s = sc.next();
            if (i % 2 == 0) {
                for (int k = 0; k < 8; k += 2) {
                    if (s.charAt(k) == 'F')
                        count++;
                }
            } else {
                for (int k = 1; k < 8; k += 2) {
                    if (s.charAt(k) == 'F')
                        count++;
                }

            }
        }

        System.out.println(count);
        sc.close();
    }

}