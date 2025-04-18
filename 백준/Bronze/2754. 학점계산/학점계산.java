import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        float score = 0;
        switch (s.charAt(0)) {
            case 'A':
                score += 4;
                break;
            case 'B':
                score += 3;
                break;
            case 'C':
                score += 2;
                break;
            case 'D':
                score += 1;
                break;
            default:
                break;
        }
        if (s.length() == 2) {
            switch (s.charAt(1)) {
                case '+':
                    score += 0.3;
                    break;
                case '-':
                    score -= 0.3;
                    break;
                default:
                    break;
            }
        }
        sc.close();
        System.out.println(score);

    }
}
