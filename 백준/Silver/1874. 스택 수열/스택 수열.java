import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        List<Character> list = new ArrayList<>();
        int count = 1;
        stack.push(count++);
        list.add('+');
        for (int i = 1; i <= n; i++) {
            int a = Integer.parseInt(br.readLine());
            while (count <= n + 1) {
                if (!stack.isEmpty() && stack.peek() == a) {
                    stack.pop();
                    list.add('-');
                    break;
                } else {
                    stack.push(count++);
                    list.add('+');
                }
            }
        }
        if (!stack.isEmpty() && count > n)
            System.out.println("NO");
        else{
            for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        }

    }
}