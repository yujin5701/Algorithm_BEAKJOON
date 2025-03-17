import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), num = 0, index = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        int[] result = new int[n];
        for (int i = 1; i <= n; i++) { // 동적 리스트에 1~7까지 할당당
            arr.add(i);
        }
        int a = 0;
        while (!arr.isEmpty()) {
            a = (a + k - 1) % arr.size();
            result[index++] = arr.get(a);
            arr.remove(a);
        }

        System.out.print("<");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(result[i] + ", ");
        }
        System.out.print(result[n - 1] + ">");
        sc.close();
    }
}
