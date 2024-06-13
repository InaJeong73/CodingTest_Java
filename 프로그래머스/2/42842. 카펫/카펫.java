class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer=new int[2];
        int area=brown+yellow;
        //i는 세로,j가 가로
        for(int i=1;i*i<=area;i++){
            if(area%i==0){
                int j=area/i;
                int num=2*(i+j)-4;
                if(num==brown){
                   answer[0]=j;
                    answer[1]=i;
                    break;
                }
            }
        }
        return answer;
    }
}