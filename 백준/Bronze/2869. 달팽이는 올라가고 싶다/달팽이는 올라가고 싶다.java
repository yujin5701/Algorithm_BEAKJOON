import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int up = sc.nextInt(), down = sc.nextInt(), h = sc.nextInt();
        int count = (h - down) / (up - down);
        if ((h - up) % (up - down) != 0)
            count++;

        System.out.println(count);

        sc.close();
    }
}