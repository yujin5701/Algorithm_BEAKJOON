import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        while (true) {
            if (count == s.length())
                break;
            char ch = s.charAt(count);
            System.out.print(ch);
            if (count % 10 == 9)
                System.out.println();
            count++;
        }
        sc.close();

    }
}