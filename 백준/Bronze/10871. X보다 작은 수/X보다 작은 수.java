import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a < x)
                arr.add(a);
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        sc.close();
    }
}