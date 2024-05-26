import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main{
	public static int[][]d;
	public final static int MOD=1000000009;
    public static void main(String[]args)throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int num=Integer.parseInt(br.readLine());
        int[]cases=new int[num];
        int maxN=0;
        for(int i=0;i<num;i++) {
        	int n=Integer.parseInt(br.readLine());
        	cases[i]=n;
        	if(n>maxN) {
        		maxN=n;
        	}
        }
        d=new int[maxN+1][4];
        
        for(int i=0;i<num;i++) {
        	int result=0;
        	int n=cases[i];
        	for(int j=1;j<=3;j++) {
    		result=(result+go(n,j))%MOD;
        	}
    		bw.write(Integer.toString(result));
    		if(i<num-1) {
    			 bw.write("\n");
    		 }
        	}
        bw.flush();
        bw.close();
}
    
    public static int go(int n,int k) {
    	if(n<0) {
    		return 0;
    	}
    	if((n>=1&&n<=3)&&n==k ){
    		return 1;
    	}
    	
    	if(d[n][k]>0) {
    		return d[n][k];
    	}
    	for(int i=1;i<=3;i++) {
    		if(i!=k) {
    		d[n][k]=d[n][k]+go(n-k,i);
    		}
    	}
    	d[n][k]%=MOD;
    	return d[n][k];
    }
}

