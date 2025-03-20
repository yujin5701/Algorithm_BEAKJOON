import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), count = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            Boolean num = true;
            if (a == 1)
                continue;

            else if (a == 2)
                count++;
            else {
                for (int j = 2; j < a; j++) {
                    if (a % j == 0)
                        num = false;
                }
                if (num == true)
                    count++;
            }
        }
        System.out.println(count);

        sc.close();
    }
}