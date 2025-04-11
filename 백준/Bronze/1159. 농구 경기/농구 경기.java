import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[27];
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            String s = sc.next();
            char ch = s.charAt(0);
            int num = (int) ch - 96;
            arr[num]++;
        }
        boolean exist = false;
        for (int i = 0; i <= 26; i++) {
            if (arr[i] >= 5) {
                char ch = (char) (i + 96);
                System.out.print(ch);
                exist = true;
            }
        }
        if (exist == false) {
            System.out.println("PREDAJA");
        }
        sc.close();
    }
}
