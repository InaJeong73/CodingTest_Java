import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        
        long num=Long.parseLong(br.readLine());
        bw.write(Long.toString(num*(num-1)*(num-2)/6)+"\n");
        bw.write(Long.toString(3));
        bw.flush();
        bw.close();
    }
}