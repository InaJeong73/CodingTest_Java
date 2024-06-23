import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer>minHeap=new PriorityQueue<>();
        for(int i=0;i<operations.length;i++){
            StringTokenizer st=new StringTokenizer(operations[i]);
            String s=st.nextToken();
            if(s.equals("I")){
                minHeap.add(Integer.parseInt(st.nextToken()));
            }else if(s.equals("D")){
                int n=Integer.parseInt(st.nextToken());
                if(minHeap.isEmpty())continue;
                if(n==1){
                    PriorityQueue<Integer>maxHeap=new PriorityQueue<>(Collections.reverseOrder());
                    maxHeap.addAll(minHeap);
                    maxHeap.poll();
                    minHeap.clear();
                    minHeap.addAll(maxHeap);
                }else if(n==-1){
                    minHeap.poll();
                }
            }
        }
        int[] answer=new int[2];
        if(minHeap.isEmpty()){
            answer[0]=0;
            answer[1]=0;
        }
        else{
            answer[1]=minHeap.peek();
            PriorityQueue<Integer>maxHeap=new PriorityQueue<>(Collections.reverseOrder());
            maxHeap.addAll(minHeap);
            answer[0]=maxHeap.peek();
        }
        return answer;
    }
}