import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[]restProgresses=new int[progresses.length];
        Queue<Integer>dq=new LinkedList<>();
        ArrayList<Integer>aq=new ArrayList<Integer>();
        for(int i=0;i<progresses.length;i++){
            restProgresses[i]=100-progresses[i];
        }
        for(int i=0;i<progresses.length;i++){
            int restProgress=restProgresses[i];
            int speed=speeds[i];
            if(restProgress%speed==0)dq.add(restProgress/speed);
            else dq.add(restProgress/speed+1);
        }
        int count=0;
        int mNum=dq.poll();
        count++;
        while(!dq.isEmpty()){
            int num=dq.poll();
            if(mNum<num){
                aq.add(count);
                count=0;
                mNum=num;
            }
            count++;
        }
        aq.add(count);
        int[] answer = new int[aq.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=aq.get(i);
        }
      
        return answer;
    }
}