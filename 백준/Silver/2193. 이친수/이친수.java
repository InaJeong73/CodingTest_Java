import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main{
	public static long[][]d;
    public static void main(String[]args)throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int num=Integer.parseInt(br.readLine());//전체 자릿수
        
        d=new long[num+1][2];
        
        	long result=0;
    		result=go(num,0)+go(num,1);
    		bw.write(Long.toString(result));
        bw.flush();
        bw.close();
}
    
    public static long go(int n,int k) {
    	if(n==1) {
    		if(k==0)return 0;
    		else if(k==1) return 1;
    	}
    	if(d[n][k]>0) {
    		return d[n][k];
    	}
		if(k==0) {
			d[n][k]=go(n-1,0)+go(n-1,1);
		}else if(k==1){
			d[n][k]=go(n-1,0);
		}
    	return d[n][k];
    }
}

