import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Word implements Comparable<Word> {
    String content;
    int len;

    public Word(String content, int len) {
        this.content = content;
        this.len = len;
    }

    @Override
    public int compareTo(Word o) {
        if (this.len > o.len)
            return 1;
        else if (this.len == o.len) {
            int i = 0;
            if (this.content.equals(o.content))
                return 1;
            while (this.content.charAt(i) == o.content.charAt(i)) {
                i++;
            }
            if (this.content.charAt(i) > o.content.charAt(i))
                return 1;
        }
        return -1;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Word> words = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String w = sc.next();
            words.add(new Word(w, w.length()));
        }

        Collections.sort(words);
        for (int i = 0; i < n; i++) {
            if (i > 0 && words.get(i).content.equals(words.get(i - 1).content)) {

            } else {
                System.out.println(words.get(i).content);
            }

        }
        sc.close();

    }
}