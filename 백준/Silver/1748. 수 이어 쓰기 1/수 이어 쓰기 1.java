
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main{
   
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        long num=Integer.parseInt(br.readLine());
        long count=0;
        long sum=0;
        StringBuilder sb=new StringBuilder(Long.toString(9));
        long nine=Long.parseLong(sb.toString());
        long beforeNine=0;
        while(num>nine) {
        	count++;
        	sum+=(nine-beforeNine)*count;
        	beforeNine=nine;
        	sb.append(Long.toString(9));
        	nine=Long.parseLong(sb.toString());
        }
        count++;
        sum+=(num-beforeNine)*count;
        bw.write(Long.toString(sum));
        bw.flush();
        bw.close();
    }
}
    