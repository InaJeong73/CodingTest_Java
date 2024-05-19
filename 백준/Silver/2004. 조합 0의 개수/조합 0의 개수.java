import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        long result = countTrailingZeros(n, m);
        bw.write(Long.toString(result));
        bw.flush();
        bw.close();
    }

    public static long countTrailingZeros(long n, long m) {
        long count2 = countFactor(n, 2) - countFactor(n - m, 2) - countFactor(m, 2);
        long count5 = countFactor(n, 5) - countFactor(n - m, 5) - countFactor(m, 5);
        return Math.min(count2, count5);
    }

    public static long countFactor(long num, long factor) {
        long count = 0;
        for (long i = factor; i <= num; i *= factor) {
            count += num / i;
        }
        return count;
    }
}
