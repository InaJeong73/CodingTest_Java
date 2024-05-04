import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main {
    public static Stack<Character> leftStack = new Stack<Character>();
    public static Stack<Character> rightStack = new Stack<Character>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            leftStack.add(str.charAt(i));
        }

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str1 = st.nextToken();
            if (str1.equals("L")) {
                if (leftStack.isEmpty()) {
                    continue;
                } else {
                    char k = leftStack.pop();
                    rightStack.add(k);
                }
            } else if (str1.equals("D")) {
                if (rightStack.isEmpty()) {
                    continue;
                } else {
                    char k = rightStack.pop();
                    leftStack.add(k);
                }
            } else if (str1.equals("B")) {
                if (leftStack.isEmpty()) {
                    continue;
                } else {
                    leftStack.pop();
                }
            } else if (str1.equals("P")) {
                String whatNum = st.nextToken();
                leftStack.add(whatNum.charAt(0));
            } else {
                break;
            }
        }
        
        // 왼쪽 스택을 출력하기 위해 오른쪽 스택을 뒤집음
        while (!leftStack.isEmpty()) {
            rightStack.add(leftStack.pop());
        }
        while (!rightStack.isEmpty()) {
            bw.write(rightStack.pop());
        }

        bw.flush();
        bw.close();
    }
}
