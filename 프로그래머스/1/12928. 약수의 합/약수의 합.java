class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(i==n/i){
                    sum+=i;
                    continue;
                }
                sum+=i;
                sum+=n/i;
            }
        }
        return sum;
    }
}