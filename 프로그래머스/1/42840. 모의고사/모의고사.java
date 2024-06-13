import java.util.Arrays;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = new int[0];
        int[]count=new int[3];
        count[0]=count_supoja1(answers);
        count[1]=count_supoja2(answers);
        count[2]=count_supoja3(answers);
        int max=0;
        for(int i=0;i<3;i++){
            if(max<count[i])max=count[i];
        }

        for(int i=0;i<3;i++){
            if(count[i]==max){
                answer=Arrays.copyOf(answer,answer.length+1);
                answer[answer.length-1]=i+1;
            }
        }
        return answer;
    }
    public int count_supoja1(int[]answers){
        int[]answer={ 1, 2, 3, 4, 5};
        int count=0;
        for(int i=0;i<answers.length;i++){
            if(answer[i%5]==answers[i]){
               count++; 
            }
        }
        return count;
    }
    public int count_supoja2(int[]answers){
        int[]answer={ 2, 1, 2, 3, 2, 4, 2, 5};
        int count=0;
        for(int i=0;i<answers.length;i++){
            if(answer[i%8]==answers[i]){
               count++; 
            }
        }
        return count;
    }
    public int count_supoja3(int[]answers){
        int[]answer={3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int count=0;
        for(int i=0;i<answers.length;i++){
            if(answer[i%10]==answers[i]){
               count++; 
            }
        }
        return count;
    }
}
