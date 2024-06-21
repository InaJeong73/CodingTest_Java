import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        boolean find=false;
        Arrays.sort(participant);
        Arrays.sort(completion);
        for(int i=0;i<completion.length;i++){
            if(!participant[i].equals(completion[i])){
                answer=participant[i];
                find=true;
                break;
            }
        }
        if(find==false){
            answer=participant[participant.length-1];
        }
        return answer;
    }
}