import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();

        while (true) {
            int i = sc.nextInt(), j = sc.nextInt(), k = sc.nextInt();
            int max = Math.max(i, j);
            max = Math.max(max, k);
            if (i == 0 && j == 0 && k == 0)
                break;
            if (max == i) {
                if (((k * k) + (j * j)) == (max * max)) {
                    arr.add("right");
                } else {
                    arr.add("wrong");
                }
            } else if (max == j) {
                if (((i * i) + (k * k)) == (max * max)) {
                    arr.add("right");
                } else {
                    arr.add("wrong");
                }
            } else {
                if (((i * i) + (j * j)) == (max * max)) {
                    arr.add("right");
                } else {
                    arr.add("wrong");
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        sc.close();

    }
}