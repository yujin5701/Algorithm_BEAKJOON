import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void push(ArrayList<Character> arr, char ch) {
        arr.add(ch);
    }

    public static Boolean pop(ArrayList<Character> arr, char ch) {
        if (!arr.isEmpty() && arr.get(arr.size() - 1) == ch) {
            arr.remove(arr.size() - 1);
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> result = new ArrayList<>();
        while (true) {
            String s = sc.nextLine();
            ArrayList<Character> list = new ArrayList<>();
            if (s.equals("."))
                break;

            Boolean bal = true;
            for (int i = 0; i <= s.length() - 1; i++) {
                char ch = s.charAt(i);
                switch (ch) {
                    case '[':
                        push(list, ch);
                        break;
                    case '(':
                        push(list, ch);
                        break;
                    case ']':
                        bal = pop(list, '[');

                        break;
                    case ')':
                        bal = pop(list, '(');
                        break;
                    default:
                        break;
                }
                if (bal == false)
                    break;
            }

            if (list.isEmpty() && bal == true) {
                result.add("yes");
            } else {
                result.add("no");
            }
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));

        }
        sc.close();
    }
}