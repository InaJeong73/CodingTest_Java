import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;


public class Main{
    public static Stack<Character>stack=new Stack<Character>();
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int num=Integer.parseInt(br.readLine());
        for(int i=0;i<num;i++){
            String str=br.readLine();
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)==' '){
                    while(!stack.isEmpty()){
                        bw.write(stack.pop());
                    }
                    bw.write(" ");
                }else{
                    stack.push(str.charAt(j));
                }
            }
            while(!stack.isEmpty()){
                bw.write(stack.pop());
            }
                
            if(i<num-1){
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
    }
}