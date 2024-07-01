import java.util.*;
class Vertex{
    int num;
    int distance;
    Vertex(int num, int distance){
        this.num=num;
        this.distance=distance;
    }
}

class Solution {    
    public int solution(int n, int[][] edge) {
        int answer = 0;
        boolean[]visitVertex=new boolean[edge.length+1];
        int[] minDistance=new int[n+1];
        LinkedList<Vertex>queue=new LinkedList<>();
        
        visitVertex[1]=true;
        queue.offer(new Vertex(1,0));
        
        while(!queue.isEmpty()){
            Vertex k=queue.poll();
            for(int i=0;i<edge.length;i++){
            if(edge[i][0]==k.num){
            if(!visitVertex[edge[i][1]]){
            visitVertex[edge[i][1]]=true;
            queue.offer(new Vertex(edge[i][1],k.distance+1));
            }
            }
            if(edge[i][1]==k.num){
            if(!visitVertex[edge[i][0]]){
            visitVertex[edge[i][0]]=true;   
            queue.offer(new Vertex(edge[i][0],k.distance+1));
                }
            }
             }
            minDistance[k.num]=k.distance;
        }
        int max=0;
        for(int i=1;i<minDistance.length;i++){
           if(minDistance[i]>max)max=minDistance[i];
        }
        int count=0;
        for(int i=1;i<minDistance.length;i++){
           if(minDistance[i]==max)count++;
        }
        return count;
    }  
    }
