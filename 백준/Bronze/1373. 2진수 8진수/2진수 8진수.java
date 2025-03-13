import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String bi = sc.next(); // 2진수 입력 받음 => 앞에서부터 3자리씩 끊어서
        if (bi.length() % 3 == 2)
            bi = "0" + bi;
        if (bi.length() % 3 == 1)
            bi = "00" + bi;
        // 3의 배수만큼 뒤에 0 붙여주기기

        int[] arr = new int[bi.length()];
        for (int i = 0; i < bi.length(); i++) {
            arr[i] = (int) bi.charAt(i) - 48; // arr 배열에 앞부터 숫자 하나씩 넣음
        }
        int[] res = new int[bi.length() / 3];
        int index = 0;
        for (int i = 0; i <= arr.length - 3; i = i + 3) {
            res[index++] = (arr[i] * 4) + (arr[i + 1] * 2) + arr[i + 2];
        }

        for (int i = 0; i < res.length; i++)
            System.out.print(res[i]);

        sc.close();

    }
}