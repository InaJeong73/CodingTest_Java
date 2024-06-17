import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Integer[]citationsArr=new Integer[citations.length];
        for(int i=0;i<citations.length;i++){
            citationsArr[i]=citations[i];
        }
        Arrays.sort(citationsArr,Collections.reverseOrder());
        int h=citationsArr[0];
        while(h>=0){
            int count=0;
           for(int i=0;i<citationsArr.length;i++){
            if(citationsArr[i]>=h)count++;
        } 
         if(count>=h) {
        answer=h;
           break;
        }
            h--;
        }
        
        return answer;
    }
}