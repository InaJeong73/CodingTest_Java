import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        ArrayList<Integer>intArr=new ArrayList<>();
        StringTokenizer st=new StringTokenizer(s);
        while(st.hasMoreTokens()){
            intArr.add(Integer.parseInt(st.nextToken()));
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<intArr.size();i++){
            if(intArr.get(i)<min)min=intArr.get(i);
            if(intArr.get(i)>max)max=intArr.get(i);
        }
        
        return min+" "+max;
    }
}