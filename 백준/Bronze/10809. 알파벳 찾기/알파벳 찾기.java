import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] result = new int[26];
        for (int i = 0; i < 26; i++) {
            char ch = (char) (i + 97); // 알파벳벳 a부터 비교
            for (int j = 0; j < s.length(); j++) {
                if (ch == s.charAt(j)) {
                    result[i] = j;
                    break;
                } else {
                    result[i] = -1;
                }
            }
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(result[i] + " ");
        }
        sc.close();

    }
}