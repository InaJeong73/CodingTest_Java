import java.io.*;
import java.util.*;

public class Main {
    static int N, K;
    static int[] A, tmp;
    static long count = 0;      // 되쓰기(저장) 누적 횟수
    static int answer = -1;     // K번째 저장 값 (없으면 -1 유지)

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        A = new int[N];
        tmp = new int[N];

        int filled = 0;
        while (filled < N) {
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens() && filled < N) {
                A[filled++] = Integer.parseInt(st.nextToken());
            }
        }

        mergeSort(0, N - 1);

        System.out.println(answer);
    }

    static void mergeSort(int l, int r) {
        if (l >= r) return;
        int m = (l + r) >>> 1;
        mergeSort(l, m);
        mergeSort(m + 1, r);
        merge(l, m, r);
    }

    static void merge(int l, int m, int r) {
        int i = l, j = m + 1, t = l;

        // 두 구간 병합해서 tmp에 저장
        while (i <= m && j <= r) {
            if (A[i] <= A[j]) tmp[t++] = A[i++];
            else tmp[t++] = A[j++];
        }
        while (i <= m) tmp[t++] = A[i++];
        while (j <= r) tmp[t++] = A[j++];

        // tmp[l..r] -> A[l..r] 되쓰기 (이 순간이 "저장"으로 카운트됨)
        for (i = l, t = l; i <= r; i++, t++) {
            A[i] = tmp[t];
            count++;
            if (count == K && answer == -1) {
                answer = A[i];
                // 계속 정렬은 진행하되 더 이상 answer 갱신은 하지 않음
            }
        }
    }
}
