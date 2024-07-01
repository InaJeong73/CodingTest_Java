import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        double num=Math.sqrt(n);
        double tempNum=(double)Math.floor(num);
        if(num==tempNum){
            long k=(long)num+1;
            return k*k;
        }
        return -1;
    }
}