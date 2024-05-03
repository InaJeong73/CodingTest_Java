import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int num=Integer.parseInt(br.readLine());
        for(int i=0;i<num;i++){
            Stack<Character>stack=new Stack<Character>();
            String str=br.readLine();
            for(int j=0;j<str.length();j++){
                char c=str.charAt(j);
                if(c=='('){
                    stack.push(c);
                }else if(c==')'){
                    if(stack.isEmpty()){
                        stack.push(c);
                    }else{
                    if(stack.peek()=='(') {
                    stack.pop();
                    	}else {
                    		stack.push(c);
                    	}
                    }
                }
            }
            if(stack.isEmpty()){
                 if(i==num-1){
                   bw.write("YES");
                }else{
               bw.write("YES\n");
                 }
           }else{
                if(i==num-1){
                   bw.write("NO");
               }else{
                    bw.write("NO\n");
                }
           }
        }
         bw.flush();
         bw.close();
    }
}