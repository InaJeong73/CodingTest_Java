class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        boolean []existNum=new boolean[10];
        for(int i=0;i<numbers.length;i++){
            existNum[numbers[i]]=true;
        }
        int sum=0;
        for(int i=0;i<existNum.length;i++){
            if(!existNum[i])sum+=i;
        }
        answer=sum;
        return answer;
    }
}