import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        boolean[]out=new boolean[priorities.length];
        Queue<Integer>q=new LinkedList<Integer>();
        ArrayList<Integer>l=new ArrayList<Integer>();
        for(int i=0;i<priorities.length;i++){
            q.add(i);
        }
        boolean skip;
        int order=0;
        while(!q.isEmpty()){
            skip=false;
            int index=q.poll();
            int num=priorities[index];
            for(int i=0;i<priorities.length;i++){
                if(!out[i]&&priorities[i]>num){
                    q.add(index);
                    skip=true;
                    break;
                }
            }
            if(skip==false){
               order++;
                if(index==location) return order;
                else out[index]=true;
            }
        }
        return order;
    }
}