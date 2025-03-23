import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            ArrayList<Character> arr = new ArrayList<>();
            String s = sc.next();
            Boolean VPS = true;
            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);

                if (ch == '(') {
                    arr.add(ch);

                } else {
                    if (arr.isEmpty()) {
                        VPS = false;
                        break;
                    }
                    arr.remove(arr.size() - 1);

                }
            }
            if (VPS == true && arr.isEmpty())
                result[i] = "YES";
            else
                result[i] = "NO";
        }

        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
        sc.close();

    }
}