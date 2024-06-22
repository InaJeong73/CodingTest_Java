import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String,Integer>hashmap=new HashMap<>();
       for(int i=0;i<clothes.length;i++){
           String type=clothes[i][1];
            hashmap.put(type,hashmap.getOrDefault(type,0)+1);//value에 개수를 저장한다. 
       }
        
        for(int count:hashmap.values()){
          answer*=(count+1);  
        }
        return answer-1;
    }
    
}