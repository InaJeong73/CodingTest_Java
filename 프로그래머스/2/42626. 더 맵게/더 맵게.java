import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer>minHeap=new PriorityQueue<>();
        for(int i=0;i<scoville.length;i++){
            minHeap.add(scoville[i]);
        }
        int count=0;
        while(minHeap.peek()<K){
            if(minHeap.size()==1){
                return -1;
            }
            int n1=minHeap.poll();
            int n2=minHeap.poll();
            minHeap.add(n1+n2*2);
            count++;
        }
       
        return count;
    }
}