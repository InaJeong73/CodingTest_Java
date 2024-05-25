import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Main{
	public static int[]p;
	public static int[]d;
    public static void main(String[]args)throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int num=Integer.parseInt(br.readLine());
        p=new int[num+1];
        d=new int[num+1];
        for(int i=0;i<num+1;i++) {
    		if(i==0) {
        		d[i]=0;
        	}else {
        		d[i]=-1;
        	}
        	}
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=1;i<p.length;i++) {
        	p[i]=Integer.parseInt(st.nextToken());
        }
        bw.write(Integer.toString(go(num)));
        bw.flush();
        bw.close();
}
    public static int go(int n) {
        if(d[n]>0) {
    		return d[n];
    	}
    	for(int i=1;i<=n;i++) {
    		if(d[n]==-1||d[n]>go(n-i)+p[i]) {
    			d[n]=go(n-i)+p[i];
    		}
    	}
    	return d[n];
    }
}

