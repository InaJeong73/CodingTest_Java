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
        Stack<Integer>stack=new Stack<Integer>();
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<numStr.length();i++){
            int num=Integer.parseInt(String.valueOf(numStr.charAt(i)));
            for(int j=0;j<3;j++) {
            	stack.push(num%2);
            	num=num/2;
            }
            	while(!stack.isEmpty()) {
            		sb.append(Integer.toString(stack.pop()));
            }
        }
       while(sb.length()>1&&sb.charAt(0)=='0') {
    	   sb.deleteCharAt(0);
       }
       bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
