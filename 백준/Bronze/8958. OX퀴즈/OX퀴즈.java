import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            int score = 0, correct = 1;
            for (int j = 0; j <= s.length() - 1; j++) {
                char ch = s.charAt(j);
                if (ch == 'O') {
                    score = score + correct;
                    correct++;
                } else {
                    correct = 1;
                }
            }
            arr[i] = score;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}