import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt(), count = 0;

        for (int i = 0; i < test; i++) {

            String str = sc.next();
            Boolean same = true;

            for (int j = 1; j < str.length(); j++) {

                if (str.charAt(j - 1) != str.charAt(j)) {
                    for (int k = 0; k < j; k++) {
                        if (str.charAt(k) == str.charAt(j)) {
                            same = false;
                        }
                    }
                }
            }
            if (same == true) {
                count++;
            }

        }

        System.out.println(count);
        sc.close();

    }

}
