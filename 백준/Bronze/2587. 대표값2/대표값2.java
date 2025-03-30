import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            arr.add(sc.nextInt());
            sum += arr.get(i);
        }
        Collections.sort(arr);
        System.out.println(sum / 5);
        System.out.println(arr.get(2));

        sc.close();

    }
}