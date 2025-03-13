import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> str = new ArrayList<String>();

        while (true) {
            String st = sc.nextLine();
            if (st.equals("#"))
                break;
            str.add(st);
        }
        int[] res = new int[str.size()];

        for (int i = 0; i < str.size(); i++) { // i번째 문장 안에서 반복복
            String strin = str.get(i);
            int count = 0;
            for (int j = 0; j < strin.length(); j++) {
                char ch = strin.charAt(j);
                if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E'
                        || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
                        || ch == 'u' || ch == 'U')
                    count++;
            }
            res[i] = count;

        }
        for (int i = 0; i < str.size(); i++) {
            System.out.println(res[i]);
        }

        sc.close();
    }
}