import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void push(ArrayList<Integer> arr, int n) {
        arr.add(n);
    }

    public static int pop(ArrayList<Integer> arr) {
        if(arr.isEmpty()) return -1;
        int num = arr.get(arr.size() - 1);
        arr.remove(arr.size() - 1);
        return num;
    }

    public static int size(ArrayList<Integer> arr) {
        return arr.size();
    }

    public static int empty(ArrayList<Integer> arr) {
        if (arr.isEmpty())
            return 1;
        else
            return 0;
    }

    public static int top(ArrayList<Integer> arr) {
        if (arr.isEmpty())
            return -1;
        else
            return arr.get(arr.size() - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            switch (s) {
                case "push":
                    int a = sc.nextInt();
                    push(arr, a);
                    break;
                case "pop":
                    System.out.println(pop(arr));
                    break;
                case "size":
                    System.out.println(size(arr));
                    break;
                case "empty":
                    System.out.println(empty(arr));
                    break;
                case "top":
                    System.out.println(top(arr));
                    break;
                default:
                    break;
            }
        }

        sc.close();
    }
}