import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static char[][] board;
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        board = new char[N][M];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        int minPaint = Integer.MAX_VALUE;

        // 모든 8x8 시작점에 대해 검사
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                minPaint = Math.min(minPaint, countRepaint(i, j));
            }
        }

        System.out.println(minPaint);
    }

    // (startRow, startCol)에서 8x8 체스판 칠해야 하는 최소 칸 수 계산
    static int countRepaint(int startRow, int startCol) {
        int count1 = 0; // 시작이 'W'인 경우
        int count2 = 0; // 시작이 'B'인 경우

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char expected1 = ((i + j) % 2 == 0) ? 'W' : 'B';
                char expected2 = ((i + j) % 2 == 0) ? 'B' : 'W';

                if (board[startRow + i][startCol + j] != expected1) count1++;
                if (board[startRow + i][startCol + j] != expected2) count2++;
            }
        }
        return Math.min(count1, count2);
    }
}
