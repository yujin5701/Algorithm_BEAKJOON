import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt() % 42;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Boolean exist = false;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) == arr[i]) {
                    exist = true;
                }
            }
            if (exist == false) {
                list.add(arr[i]);
            }
        }
        System.out.println(list.size());

        sc.close();
    }
}