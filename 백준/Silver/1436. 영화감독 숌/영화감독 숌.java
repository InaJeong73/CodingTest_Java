import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        int count = 0;
        int num = 665; // 바로 다음인 666부터 검사되도록 시작값을 665로 둠

        while (count < N) {
            num++;
            if (contains666(num)) {
                count++;
            }
        }
        System.out.println(num);
    }

    private static boolean contains666(int x) {
        // 문자열 변환이 가장 간단하고 N<=10000에서 충분히 빠름
        return Integer.toString(x).contains("666");
    }
}
