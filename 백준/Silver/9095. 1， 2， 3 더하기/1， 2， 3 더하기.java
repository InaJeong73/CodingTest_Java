import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main{
	public static long[]d=new long [11];
    public static void main(String[]args)throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int num=Integer.parseInt(br.readLine());
        for(int i=0;i<num;i++) {
        	int n=Integer.parseInt(br.readLine());
        	bw.write(Long.toString(go(n)));
        	if(i<num-1) {
        		bw.write("\n");
        	}
        }
        bw.flush();
        bw.close();
}
    public static long go(int n) {
    	if(n==1) {
    		d[n]=1;
    		return d[n];
    	}
    	if(n==2){
    		d[n]=2;
    		return d[n];
    	}
    	if(n==3){
    		d[n]=4;
    		return d[n];
    	}
    	if(d[n]>0) return d[n];
    	
    	d[n]=go(n-1)+go(n-2)+go(n-3);
    	return d[n];
    }
}



