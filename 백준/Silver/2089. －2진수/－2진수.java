import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        long N=Long.parseLong(br.readLine());
        Stack<Long>stack=new Stack<Long>();
        	long temp=0;
        	if(N==0) {
        		stack.push(N);
        	}
        	while(N!=0) {
        	if(N<0) {
        		temp=N;
        		if(N%(-2)==0) {
        			N=N/(-2);
        			stack.push(temp%(-2));
        		}else {
        			N=N/(-2)+1;
        			stack.push(temp-N*(-2));
        		}
        		
        	}else {
        		temp=N;
        		N=N/(-2);
        		stack.push(temp%(-2));
        	}
        	}
        	while(!stack.isEmpty()) {
        		 bw.write(Long.toString(stack.pop()));
        	}
        bw.flush();
        bw.close();
    }
}
