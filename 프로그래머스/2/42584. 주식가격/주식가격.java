import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int n=prices.length;
        int[] answer = new int[prices.length];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                answer[i]++;
                if(prices[i]>prices[j]) break;
            }
        }
        // Stack<Integer>stack=new Stack<Integer>();
        // Stack<Integer>tempStack=new Stack<Integer>();
        // for(int i=prices.length-1;i>=0;i--){
        //     stack.push(prices[i]);
        // }
        // int i=0;
        // while(!stack.isEmpty()){
        //  int num=stack.pop();
        //     while(!stack.isEmpty()){
        //         int tempNum=stack.pop();
        //         tempStack.push(tempNum);
        //         if(num>tempNum)break;
        //         }
        //     answer[i]=tempStack.size();
        //     while(!tempStack.isEmpty()){
        //         stack.push(tempStack.pop());
        //     }
        //     i++;
        // }
        return answer;
    }
}