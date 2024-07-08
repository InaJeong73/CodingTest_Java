import java.util.*;
class Solution
{
    public int solution(String s){
        int answer = -1;
        StringBuilder sb=new StringBuilder(s);
        Stack<Character>st=new Stack<Character>();
        st.push(s.charAt(0));
        int i=1;
        while(i<s.length()){
        if(st.isEmpty())st.push(s.charAt(i));
        else{
            if(st.peek()==s.charAt(i)){
            st.pop();
        }else{
           st.push(s.charAt(i)); 
        }
        }
        i++;
        }
    if(st.isEmpty())return 1;
    else return 0;
    }
}