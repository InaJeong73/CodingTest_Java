import java.util.*;
class Solution {
    public int[] solution(long n) {
        String str=String.valueOf(n);
        int[]answer=new int[str.length()];
        int k=0;
        for(int i=str.length()-1;i>=0;i--){
            answer[k]=Integer.parseInt(String.valueOf(str.charAt(i)));
            k++;
        }
        return answer;
    }
}