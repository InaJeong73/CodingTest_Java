class Solution {
    public static long[]record;
    public long solution(int n) {
        record=new long[n+1];
        long answer = go(n)%1234567;
        
        return answer;
    }
    public static long go(int n){
        if(n==0) return 1;
        if(n<0) return 0;
        if(record[n]!=0) return record[n]%1234567;
        else {
            record[n]=go(n-1)%1234567+go(n-2)%1234567;
            return record[n]%1234567;
        }
    }
}