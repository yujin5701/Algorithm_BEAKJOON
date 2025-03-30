import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int count = st.length();
        for (int i = 0; i < st.length() - 1; i++) {
            char ch = st.charAt(i);
            if (ch == 'c') {
                if (st.charAt(i + 1) == '=') {
                    count--;
                    i++;
                } else if (st.charAt(i + 1) == '-') {
                    count--;
                    i++;
                }
            }
            if (ch == 'd') {
                if (st.charAt(i + 1) == 'z') {
                    if(i + 2 < st.length()){
                       if (st.charAt(i + 2) == '=') {
                        count -= 2;
                        i += 2;
                        
                    } 
                    }
                    
                } else if (st.charAt(i + 1) == '-') {
                    count--;
                    i++;
                }
            }
            if (ch == 'l') {
                if (st.charAt(i + 1) == 'j') {
                    count--;
                    i++;
                }
            }
            if (ch == 'n') {
                if (st.charAt(i + 1) == 'j') {
                    count--;
                    i++;
                }
            }
            if (ch == 's' || ch == 'z') {
                if (st.charAt(i + 1) == '=') {
                    count--;
                    i++;
                }
            }
        }
        System.out.println(count);
        sc.close();

    }
}
