import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        HashMap<String,ArrayList<String>>map=new HashMap<>();
        for(int i=0;i<clothes.length;i++){
            if(!map.containsKey(clothes[i][1])){
                map.put(clothes[i][1],new ArrayList<String>());
            }
            map.get(clothes[i][1]).add(clothes[i][0]);
        }
        
        
        Set<String> m=map.keySet();
        int answer=1;
        for(String s:m){
            ArrayList<String>arr=map.get(s);
           answer*=(arr.size()+1);
        }
        return answer-1;
    }
}