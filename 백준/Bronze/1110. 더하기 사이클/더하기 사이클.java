import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n = N, a, b, count = 0;
        while (true) {
            a = n / 10;
            b = n % 10; 
            n = a + b; 
            n = b * 10 + (n % 10); 
            count++;
            if (n == N)
                break;
        }
        System.out.println(count);
        sc.close();
    }
}