import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0, div = 0;
        for (int i = 0; i < 20; i++) {
            String s = sc.next();
            Double f = sc.nextDouble();
            String score = sc.next();
            switch (score) {
                case "A+":
                    sum += 4.5 * f;
                    div += f;
                    break;
                case "A0":
                    sum += 4 * f;
                    div += f;
                    break;
                case "B+":
                    sum += 3.5 * f;
                    div += f;
                    break;
                case "B0":
                    sum += 3 * f;
                    div += f;
                    break;
                case "C+":
                    sum += 2.5 * f;
                    div += f;
                    break;
                case "C0":
                    sum += 2 * f;
                    div += f;
                    break;
                case "D+":
                    sum += 1.5 * f;
                    div += f;
                    break;
                case "D0":
                    sum += 1 * f;
                    div += f;
                    break;
                case "F":
                    sum += 0;
                    div += f;
                    break;
                default:
                    break;
            }
        }
        System.out.println(sum / div);
        sc.close();

    }
}
