import java.util.*;
//가능한 모든 경로를 구해야하기 때문에 dfs가 더 적합해보임(재귀함수, Stack, check[])
class Solution {
    public static String[][]t;
    public static boolean[]c;
    public static ArrayList<String>s;
    public static ArrayList<String> r;
    public static ArrayList<String> tempR;
    public String[] solution(String[][] tickets) {
        t=tickets;
        c=new boolean[t.length];
        s=new ArrayList<String>();
        r=new ArrayList<String>();
        dfs("ICN");
        Collections.sort(r);
        String[]answer=new String[t.length+1];
        StringTokenizer st=new StringTokenizer(r.get(0));
        for(int i=0;i<t.length+1;i++){
            answer[i]=st.nextToken();
        }
        
        return answer;
       
    }
    //현재 index의 항공권이 이미 이용한 항공권인지 확인
    // 현재 count가 총 ticket의 개수와 동일한지 검사 후 동일하다면 ArrayList<int[]>에 저장
    public static void dfs(String str){
        s.add(str);
        if(s.size()==t.length+1) {
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<s.size();i++){
                sb.append(s.get(i));
                sb.append(" ");
            }
            r.add(sb.toString().trim());
            return;
        }
         for(int i=0;i<t.length;i++){
              if(!c[i]&&t[i][0].equals(str)) {
                  c[i]=true;
                  dfs(t[i][1]);
                  s.remove(s.size()-1);
                  c[i]=false;
              }
            }
}
}