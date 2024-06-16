import java.util.*;
class Solution {
    public static String []vowel={"A", "E", "I", "O", "U"};
    public static List<String>list;
    public int solution(String word) {
        int answer = 0;
        list=new ArrayList<String>();
        dfs("",0);
        // list.sort(Comparator.naturalOrder());
        int size=list.size();
        for(int i=0;i<size;i++){
            if(list.get(i).equals(word)){
               answer=i;
                break;
            }
        }
        return answer;
    }
    public static void dfs(String str,int length){
        if(length>5)return;
        list.add(str);
        for(int i=0;i<vowel.length;i++){
            dfs(str+vowel[i],length+1);
        }
    }
}