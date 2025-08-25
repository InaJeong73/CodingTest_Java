import java.util.Scanner;

public class Main {
    static int count; // recursion 호출 횟수 카운트

    public static int recursion(String s, int l, int r) {
        count++; // recursion이 호출될 때마다 증가
        if (l >= r) return 1;
        else if (s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l + 1, r - 1);
    }

    public static int isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트케이스 개수
        sc.nextLine(); // 개행 처리

        for (int i = 0; i < T; i++) {
            String s = sc.nextLine();
            count = 0; // 각 테스트케이스마다 초기화
            int result = isPalindrome(s);
            System.out.println(result + " " + count);
        }

        sc.close();
    }
}
