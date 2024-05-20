import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < num; i++) {
            long sum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long[] longArr = new long[n];
            for (int j = 0; j < n; j++) {
                longArr[j] = Long.parseLong(st.nextToken());
            }
            for (int j = 0; j < longArr.length - 1; j++) {
                long a = longArr[j];
                for (int k = j + 1; k < longArr.length; k++) {
                    long b = longArr[k];
                    sum += GCD(a, b);
                }
            }
            bw.write(Long.toString(sum));
            if (i < num - 1) {
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
    }

    public static long GCD(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return GCD(b, a % b);
        }
    }
}
