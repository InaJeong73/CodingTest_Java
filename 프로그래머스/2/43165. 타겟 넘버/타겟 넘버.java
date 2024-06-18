import java.util.*;
class Solution {
    public static boolean[][]c;
    public static int[]numArr;
    public static int t;
    public static Stack<Integer>s=new Stack<Integer>();
    public static int count=0;
    public int solution(int[] numbers, int target) {
        numArr=numbers;
        c=new boolean[numbers.length][2];
        t=target;
        dfs(0);
        int answer =count;
        return answer;
    }
    public static void dfs(int index){
        if(index==numArr.length){
            int sum=0;
            Stack<Integer>st=new Stack<Integer>();
            st.addAll(s);
            for(int i=0;i<numArr.length;i++){
                int num=st.pop();
                if(num==0)sum-=numArr[i];
                if(num==1)sum+=numArr[i];
            }
            if(sum==t)count++;
            return;
            }
      for(int i=0;i<2;i++){
          if(c[index][i])continue;
          c[index][i]=true;
          s.push(i);
          dfs(index+1);
          s.pop();
          c[index][i]=false;
    }
}
}