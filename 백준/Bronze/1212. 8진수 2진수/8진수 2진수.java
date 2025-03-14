import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String octal = sc.next();  
        sc.close();

        
        String binary = new java.math.BigInteger(octal, 8).toString(2);

        System.out.println(binary);
    }
}
