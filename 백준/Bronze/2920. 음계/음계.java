import java.util.Scanner;

public class Main {
    public static Boolean isA(int[] arr) {
        for (int i = 0; i < 7; i++) {
            if (arr[i] != i + 1) {
                return false;
            }
        }
        return true;
    }

    public static Boolean isD(int[] arr) {
        for (int i = 0; i < 7; i++) {
            if (arr[i] != 8 - i) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }

        if (isA(arr))
            System.out.println("ascending");
        else if (isD(arr))
            System.out.println("descending");
        else {
            System.out.println("mixed");
        }

        sc.close();
    }
}
