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
        int[]numArr=new int[num];
        Stack<Double> stack=new Stack<Double>();
        String function=br.readLine();
        for(int i=0;i<num;i++){
            numArr[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<function.length();i++){
            char c=function.charAt(i);
            if(Character.isUpperCase(c)){
                stack.push((double)numArr[(int)c-65]);
            }else{
                double num2=stack.pop();
                double num1=stack.pop();
                if(c=='+'){
                   stack.push(num1+num2); 
                }else if(c=='-'){
                   stack.push(num1-num2);  
                }else if(c=='*'){
                   stack.push(num1*num2);  
                }else if(c=='/'){
                   stack.push(num1/num2); 
                }
            }
        }
        double result=stack.pop();
        bw.write(String.format("%.2f",result));
        bw.flush();
        bw.close();
        
    }
}