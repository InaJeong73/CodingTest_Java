import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
    static final int MAX = 1000000; // 입력 범위 설정
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] isPrime = new boolean[MAX + 1];
        findPrimes(isPrime); // 입력 범위 내의 모든 소수를 찾음

        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) break;

            int a = 0;
            int b = 0;
            boolean isGoldbachCorrect = false;

            // 입력된 숫자에 대해 골드바흐의 추측을 확인
            for (int i = 3; i <= num / 2; i += 2) {
                if (!isPrime[i] && !isPrime[num - i]) {
                    isGoldbachCorrect = true;
                    a = i;
                    b = num - i;
                    break;
                }
            }

            if (!isGoldbachCorrect) {
                bw.write("Goldbach's conjecture is wrong.\n");
            } else {
                bw.write(num + " = " + a + " + " + b + "\n");
            }
        }

        bw.flush();
        bw.close();
    }

    // 에라토스테네스의 체로 소수를 찾는 메서드
    public static void findPrimes(boolean[] isPrime) {
        for (int i = 2; i*i <=MAX; i++) {
            if (!isPrime[i]) {
                for (int j = i*i; j <= MAX; j += i) {
                    isPrime[j] = true;
                }
            }
        }
    }
}
