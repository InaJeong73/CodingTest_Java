import java.util.*;
class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        int count=0;
        Queue<Integer>q=new LinkedList<Integer>();
        boolean[]check=new boolean[n];
        for(int i=0;i<n;i++){
            if(check[i])continue;
            q.add(i);
            while(!q.isEmpty()){
                int num=q.poll();
                check[num]=true;
                for(int j=0;j<n;j++){
                    if(!check[j]&&computers[num][j]==1){
                        q.add(j);
                    }
                }
            }
            count++;
        }  
        answer=count;
        return answer;
        }
    }
