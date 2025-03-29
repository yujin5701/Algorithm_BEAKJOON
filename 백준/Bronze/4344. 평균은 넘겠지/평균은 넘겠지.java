import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] result = new double[n];
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            int[] arr = new int[k];
            double avg = 0, count = 0;
            for (int j = 0; j < k; j++) {
                arr[j] = sc.nextInt();
                avg = avg + arr[j];
            }
            avg = avg / k;
            for (int j = 0; j < k; j++) {
                if (avg < arr[j])
                    count++;
            }
            result[i] = count / k * 100;
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%.3f", result[i]);
            System.out.println("%");
        }
        sc.close();

    }
}
