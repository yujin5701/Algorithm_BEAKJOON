import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> in = new HashMap<>();
        for (int i = 0; i < n; i++) {
            in.put(br.readLine(), i);
        }

        String[] out = new String[n];
        for (int i = 0; i < n; i++) {
            out[i] = br.readLine();
        }

        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(in.get(out[i]) > in.get(out[j])){
                    count++; break;
                }
            }
        }

        System.out.println(count);
    }
}