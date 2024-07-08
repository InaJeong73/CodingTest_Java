class Solution {
    public static int[]fibonnachiValue;
    public int solution(int n) {
        fibonnachiValue=new int[n+1];
        fibonnachiValue[0]=0;
        fibonnachiValue[1]=1;
        int answer =fibonnachi(n)%1234567;
        return answer;
    }
    public static int fibonnachi(int n){
        if(n<=1){
            return fibonnachiValue[n];
        }
        else{
            if(fibonnachiValue[n]!=0)return fibonnachiValue[n];
            else {
                fibonnachiValue[n]=fibonnachi(n-2)%1234567+fibonnachi(n-1)%1234567;
                return fibonnachiValue[n];
            }
        }
    }
}