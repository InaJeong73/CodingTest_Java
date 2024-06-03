import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Main{
   public static boolean[]c;
   public static int[]a;
   public static  BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        c=new boolean[N+1];
        a=new int[M];
        go(0,N,M);
        bw.flush();
        bw.close();
    }
    public static void go(int index,int n,int m)throws Exception {
    	if(index==m) {
    		for(int i=0;i<m;i++) {
				bw.write(Integer.toString(a[i]));
    			if(i<m-1) {
    				bw.write(" ");
    			}
    			if(i==m-1) {
    				bw.write("\n");
    			}
    		}
    		return;
    	}
    	for(int i=1;i<=n;i++) {
    		if(c[i])continue;
    		c[i]=true;
    		a[index]=i;
    		go(index+1,n,m);
    		c[i]=false;
    	}
    }
}
    