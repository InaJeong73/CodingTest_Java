import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main{
	public static int[][]d;
	public final static int MOD=1000000000;
    public static void main(String[]args)throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int num=Integer.parseInt(br.readLine());
        
        d=new int[num+1][10];
        
        	int result=0;
        	for(int i=0;i<=9;i++) {
    		result=(result+go(num,i))%MOD;
        	}
    		bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
}
    
    public static int go(int n,int k) {
    	if(k<0||k==10) {
    		return 0;
    	}
    	if(n==1) {
    		if(k==0)return 0;
    		else return 1;
    	}
    	if(d[n][k]>0) {
    		return d[n][k];
    	}
    	d[n][k]+=go(n-1,k-1)%MOD;
    	d[n][k]+=go(n-1,k+1)%MOD;
    	return d[n][k]%MOD;
    }
}

