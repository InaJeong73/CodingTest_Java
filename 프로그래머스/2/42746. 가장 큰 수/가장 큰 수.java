import java.util.*;
class Solution {
    public String solution(int[] numbers) {
       String[]numStr=new String[numbers.length];
        for(int i=0;i<numbers.length;i++){
            numStr[i]=String.valueOf(numbers[i]);
        }
        Arrays.sort(numStr,new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
            String o1=s1+s2;
            String o2=s2+s1;
            return o2.compareTo(o1);
        }
        });
        StringBuilder sb=new StringBuilder();
        for(String str:numStr){
            sb.append(str);
        }
        String answer=sb.toString();
        if(answer.startsWith("0"))return"0";
        return answer;
        
    }
   
}