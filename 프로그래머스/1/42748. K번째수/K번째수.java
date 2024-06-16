import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int index=0;index<commands.length;index++){
            int i=commands[index][0];
            int j=commands[index][1];
            int k=commands[index][2];
            int[]subArrays=Arrays.copyOfRange(array,i-1,j);
            Arrays.sort(subArrays);
            answer[index]=subArrays[k-1];
        }
        return answer;
    }
}