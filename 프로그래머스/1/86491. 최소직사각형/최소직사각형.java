class Solution {
    public int solution(int[][] sizes) {
        int maxLength = 0;
        int maxWidth = 0;

        for (int i = 0; i < sizes.length; i++) {
            // 가로와 세로를 정렬하여 항상 큰 값을 가로로 설정
            if (sizes[i][0] < sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }

        // 모든 명함의 가로 길이 중 최대값과 세로 길이 중 최대값을 찾음
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] > maxLength) {
                maxLength = sizes[i][0];
            }
            if (sizes[i][1] > maxWidth) {
                maxWidth = sizes[i][1];
            }
        }

        // 최대값들을 곱하여 지갑의 크기를 계산
        int answer = maxLength * maxWidth;
        return answer;
    }
}
