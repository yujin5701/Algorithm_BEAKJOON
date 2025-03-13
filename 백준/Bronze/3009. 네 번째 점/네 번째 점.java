import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int[] point = new int[2];
        for (int i = 0; i < 2; i++) {
            if (arr[0][i] == arr[1][i])
                point[i] = arr[2][i];
            else if (arr[1][i] == arr[2][i])
                point[i] = arr[0][i];
            else
                point[i] = arr[1][i];
        }

        System.out.print(point[0]);
        System.out.print(" ");
        System.out.print(point[1]);

    }
}