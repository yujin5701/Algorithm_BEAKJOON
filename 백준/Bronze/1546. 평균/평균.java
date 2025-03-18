import java.util.Scanner;

public class Main {
    public static float max(float[] arr) {
        float max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] score = new float[n];
        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
        }
        float max = max(score);
        float avg = 0;
        for (int i = 0; i < n; i++) {
            score[i] = (score[i] / max * 100);
            avg = avg + score[i];

        }
        avg = avg / n;
        System.out.println(avg);

        sc.close();

    }
}