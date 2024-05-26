import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Main{
	public static int[]D;
    public static void main(String[]args)throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int num=Integer.parseInt(br.readLine());//전체 자릿수
        StringTokenizer st=new StringTokenizer(br.readLine());
        int[]I=new int[num];
        D=new int[num];
        for(int i=0;i<num;i++) {
        	D[i]=1;
        }
        for(int i=0;i<num;i++){
        	I[i]=Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<num;i++) {
        	for(int j=0;j<i;j++) {
        		if(I[j]<I[i]&&D[i]<D[j]+1) {
        			D[i]=D[j]+1;
        		}
        	}
        }
        	int result=0;
        	
        	for(int i=0;i<num;i++) {
        	if(result<D[i]) {	
        		result=D[i];
        	}
        	}
    		bw.write(Long.toString(result));
        bw.flush();
        bw.close();
}
}

