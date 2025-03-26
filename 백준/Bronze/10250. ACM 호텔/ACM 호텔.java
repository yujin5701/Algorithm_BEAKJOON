
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int f = sc.nextInt(), r = sc.nextInt(), a = sc.nextInt();
            int floor = 0;
            int room = 1;
            for (int j = 0; j < a; j++) {
                floor++;
                if (floor == f + 1) {
                    floor = 1;
                    room++;
                }
            }
            arr[i] = floor * 100 + room;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}