import java.util.*;

public class Main {

    public static Boolean isSquare(List<int[]> points) {
        List<Integer> dis = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                dis.add(distance(points.get(i), points.get(j)));
            }
        }

        Collections.sort(dis);

        return dis.get(0).equals(dis.get(1)) &&
                dis.get(1).equals(dis.get(2)) &&
                dis.get(2).equals(dis.get(3)) &&
                dis.get(0) * 2 == dis.get(4) &&
                dis.get(4).equals(dis.get(5));
    }

    public static int distance(int[] a, int[] b) {
        return ((a[0] - b[0]) * (a[0] - b[0]) + (a[1] - b[1]) * (a[1] - b[1]));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] result = new int[T];

        for (int i = 0; i < T; i++) {
            List<int[]> points = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                points.add(new int[] { x, y });
            }

            if (isSquare(points) == true)
                result[i] = 1;
            else
                result[i] = 0;

        }
        for (int i = 0; i < T; i++) {
            System.out.println(result[i]);
        }

        sc.close();
    }
}