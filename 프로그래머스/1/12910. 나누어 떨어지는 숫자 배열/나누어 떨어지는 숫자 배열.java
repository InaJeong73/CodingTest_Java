import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer>intArr=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
           if(arr[i]%divisor==0){
               intArr.add(arr[i]);
           }
        }
        if(intArr.size()==0)intArr.add(-1);
        Collections.sort(intArr);
        int[] answer =intArr.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}