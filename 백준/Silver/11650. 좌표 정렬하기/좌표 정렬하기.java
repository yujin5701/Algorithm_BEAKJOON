import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Point implements Comparable<Point> {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public int compareTo(Point o) {
        int cmpX = Integer.compare(this.x, o.x);
        if (cmpX != 0)
            return cmpX;
        return Integer.compare(this.y, o.y);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            points.add(new Point(sc.nextInt(), sc.nextInt()));
        }

        Collections.sort(points);

        for (int i = 0; i < n; i++) {
            System.out.println(points.get(i).getX() + " " + points.get(i).getY());
        }

    }
}