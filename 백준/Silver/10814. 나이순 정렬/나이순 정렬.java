import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 10814번
class Member implements Comparable<Member> {
    int age;
    String name;
    int order;

    public Member(int age, String name, int order) {
        this.age = age;
        this.name = name;
        this.order = order;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(Member o) {
        if (this.age > o.age)
            return 1;
        else if (this.age == o.age) {
            if (this.order > o.order)
                return 1;
        }
        return -1;
    }

}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Member> members = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int age = sc.nextInt();
            String name = sc.next();
            members.add(new Member(age, name, i));
        }
        Collections.sort(members);

        for (int i = 0; i < n; i++) {
            Member m = members.get(i);
            int age = m.getAge();
            String name = m.getName();
            System.out.print(age + " ");
            System.out.println(name);
        }
        sc.close();

    }
}