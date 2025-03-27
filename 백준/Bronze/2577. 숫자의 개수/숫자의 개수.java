import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int num = a * b * c;
        int[] arr = new int[10];
        String s = Integer.toString(num);

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int n = (int) ch - 48;
            arr[n]++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
        sc.close();

    }
}