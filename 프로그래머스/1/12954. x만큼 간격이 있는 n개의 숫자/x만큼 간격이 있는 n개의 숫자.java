class Solution {
    public long[] solution(int x, int n) {
        long[] answer =new long[n];
        long lx=x;
        long ln=n;
        for(int i=0;i<n;i++){
            answer[i]=lx*(i+1);
        }
        return answer;
    }
}