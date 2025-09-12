import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String s2 = br.readLine();
        int n = s.length(), k = s2.length();
        char[] ch = new char[n];
        int top = 0;

        for (int i = 0; i < s.length(); i++) {
            ch[top++] = s.charAt(i);

            if(top >= k && ch[top - 1] == s2.charAt(k-1)) {
                boolean ok = true;
                for (int j = 0; j < k; j++) {
                    if(ch[top - k + j] != s2.charAt(j)) {
                        ok = false;
                        break;
                    }
                }
                if(ok) top -= k;
            }
        }
        if(top == 0) System.out.println("FRULA");
        else System.out.println(new String(ch,0,top));
    }
}