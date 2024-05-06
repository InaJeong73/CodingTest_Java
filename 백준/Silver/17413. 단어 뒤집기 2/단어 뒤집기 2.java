import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        ArrayList<Character> charArr = new ArrayList<Character>();
        boolean isInTag = false;
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '<') {
                isInTag = true;
                // 단어가 있으면 뒤집어서 출력
                if (word.length() > 0) {
                    System.out.print(word.reverse());
                    word.setLength(0);
                }
                System.out.print(c);
            } else if (c == '>') {
                isInTag = false;
                System.out.print(c);
            } else if (c == ' ') {
                // 단어가 있으면 뒤집어서 출력
                if (word.length() > 0) {
                    System.out.print(word.reverse());
                    word.setLength(0);
                }
                System.out.print(c);
            } else {
                if (!isInTag) {
                    word.append(c);
                } else {
                    System.out.print(c);
                }
            }
        }

        // 마지막에 단어가 있으면 뒤집어서 출력
        if (word.length() > 0) {
            System.out.print(word.reverse());
        }
    }
}
