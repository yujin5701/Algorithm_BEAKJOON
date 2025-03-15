
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), count = 0;
        for (int i = 1; i <= N; i++) {
            if (i < 100)
                count++;
            else {
                String str = Integer.toString(i);
                char a = str.charAt(0);
                char b = str.charAt(1);
                char c = str.charAt(2);
                if ((a - b) == (b - c))
                    count++;
            }
        }
        System.out.println(count);
        sc.close();
    }

}
