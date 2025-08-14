import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        int count = 0;

        while (true) {
            if (N % 5 == 0) { // 5로 나누어 떨어지면
                count += N / 5;
                System.out.println(count);
                break;
            }
            N -= 3; // 3kg 봉지 하나 사용
            count++;
            if (N < 0) { // 정확히 만들 수 없는 경우
                System.out.println(-1);
                break;
            }
        }
    }
}
