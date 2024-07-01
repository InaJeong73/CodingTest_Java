class Solution {
    public long solution(int a, int b) {
        long la=a;
        long lb=b;
        long sum=0;
        if(a<b){
        for(long i=la;i<=lb;i++){
            sum+=i;
        }
        }else if(a==b){
            return la;
        }else{
           for(long i=lb;i<=la;i++){
            sum+=i;
        }  
        }
        return sum;
    }
}