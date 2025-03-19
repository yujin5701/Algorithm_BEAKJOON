import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            list.add(Character.toString(ch));
        }
        Collections.sort(list);

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
        }

        sc.close();

    }
}