import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();

        HashSet<String> listenSet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            listenSet.add(sc.next());
        }

        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            String name = sc.next();
            if (listenSet.contains(name))
                result.add(name);
        }

        Collections.sort(result);

        System.out.println(result.size());
        for (int i = 0; i < result.size(); i++)
            System.out.println(result.get(i));
        sc.close();
    }

}