import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int a1=Integer.parseInt(st.nextToken());
        int a0=Integer.parseInt(st.nextToken());
        int c=Integer.parseInt(br.readLine());
        int n0=Integer.parseInt(br.readLine());
        
        if(a1*n0+a0<=c*n0&&c>=a1){
            bw.write(Integer.toString(1));
        }else{
            bw.write(Integer.toString(0));
        }
        
        bw.flush();
        bw.close();
    }
}