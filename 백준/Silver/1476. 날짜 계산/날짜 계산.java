import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int E=Integer.parseInt(st.nextToken());
        int S=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        
        int count=0;
        
        int i=0;
        while(true) {
        	i++;
        if((i-1)%15==E-1&&(i-1)%28==S-1&&(i-1)%19==M-1) {
        	 bw.write(Integer.toString(i));
        	 break;
        }
        }
        bw.flush();
        bw.close();
}
}

