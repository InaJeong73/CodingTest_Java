import java.util.Scanner;

public class Main {
    // 각 자리수의 합을 계산하는 함수
    public static int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10; // 일의 자리 더하기
            num /= 10;       // 다음 자리로 이동
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;

        for (int i = 1; i < N; i++) {
            int sum = i + getDigitSum(i);
            if (sum == N) {
                result = i;
                break; // 가장 작은 생성자를 찾으면 종료
            }
        }

        System.out.println(result);
    }
}
