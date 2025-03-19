import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char grade;
        if (n >= 90)
            grade = 'A';
        else if (n >= 80)
            grade = 'B';
        else if (n >= 70)
            grade = 'C';
        else if (n >= 60)
            grade = 'D';
        else
            grade = 'F';
        System.out.println(grade);
    }
}