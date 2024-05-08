import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
public class Main{
    public static void main(String[]args)throws Exception{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String str=br.readLine();
    int sticks=0;
    Stack<Integer>stack=new Stack<Integer>();
    for(int i=0;i<str.length();i++){
        char c=str.charAt(i);
        if(c=='('){
            stack.push(i);
        }else if(c==')'){
            int num=i-stack.pop();
            if(num==1){
            	sticks+=stack.size();
            }
            else if(num>1){
               sticks++;
            }
        }
    }
    System.out.print(sticks);
}
}