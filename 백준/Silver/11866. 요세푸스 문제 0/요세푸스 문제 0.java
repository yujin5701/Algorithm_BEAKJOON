import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * N명의 사람이 원형으로 앉아서 K번째마다 제거.
         * 1~n까지의 배열을 만들어놓고, k번씩 건너뛰면서 제거.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt() - 1;
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(i + 1);
        }

        int i = 0;
        List<Integer> result = new ArrayList<>();
        while (!arr.isEmpty()) { // 리스트가 빌 때까지
            i = (i + k) % arr.size(); // 현재 인덱스는 k만큼 건너뜀. 끝까지 돌았으면 다시 처음부터

            result.add(arr.get(i)); // 새 리스트에 추가
            arr.remove(i); // 기존 리스트에서는 제거
        }

        System.out.print("<");
        for (int j = 0; j < n - 1; j++) {
            System.out.print(result.get(j) + ", ");
        }
        System.out.print(result.get(n - 1));
        System.out.print(">");

        sc.close();

    }
}