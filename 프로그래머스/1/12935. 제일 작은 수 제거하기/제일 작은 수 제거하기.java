import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length==1){
             int[]answer={-1};
            return answer;
        }
        int[]tempArr=Arrays.copyOf(arr,arr.length);
        Arrays.sort(tempArr);
        int n=tempArr[0];
        int[]answer=new int[arr.length-1];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                continue;
            }
            answer[j]=arr[i];
            j++;
        }
        return answer;
    }
}