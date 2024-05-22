import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Stack;
public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        String numStr=br.readLine();
        int count=0;
        int sum=0;
        Stack<Integer>stack=new Stack<Integer>();
        for(int i=numStr.length()-1;i>=0;i--){
            int num=Integer.parseInt(String.valueOf(numStr.charAt(i)));
            if(count%3==0){
               sum+=num*1;
            }else if(count%3==1){
               sum+=num*2;
            }else if(count%3==2){
               sum+=num*4;
            }
            if(count%3==2||i==0){
                stack.push(sum);
                sum=0;
            }
            count++;
        }
        while(!stack.isEmpty()){
             bw.write(Integer.toString(stack.pop()));
        }
        bw.flush();
        bw.close();
    }
}
