import java.util.ArrayList;
import java.util.Scanner;

// 1259
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> result = new ArrayList<>();

        while (true) {
            Boolean same = true;
            String s = sc.nextLine();
            if (s.equals("0"))
                break;
            int[] arr = new int[s.length()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) s.charAt(i) - 48;
            }
            for (int i = 0; i <= arr.length / 2; i++) {
                if (arr[i] != arr[arr.length - 1 - i]) {
                    same = false;
                }
            }
            if (same == true) {
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