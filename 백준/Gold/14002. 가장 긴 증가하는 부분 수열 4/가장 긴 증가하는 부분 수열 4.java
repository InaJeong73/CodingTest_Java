import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main{
	public static int[]D;
	public static int[]I;
	public static int[]V;
	public static Stack<Integer>S=new Stack<Integer>();
    public static void main(String[]args)throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int num=Integer.parseInt(br.readLine());//전체 자릿수
        StringTokenizer st=new StringTokenizer(br.readLine());
        I=new int[num];
        V=new int[num];
        D=new int[num];
        for(int i=0;i<num;i++) {
        	D[i]=1;
        	V[i]=-1;
        }
        for(int i=0;i<num;i++){
        	I[i]=Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<num;i++) {
        	for(int j=0;j<i;j++) {
        		if(I[j]<I[i]&&D[i]<D[j]+1) {
        			D[i]=D[j]+1;
        			V[i]=j;
        		}
        	}
        }
        	int result=0;
        	int temp=0;
        	for(int i=0;i<num;i++) {
        	if(result<D[i]) {	
        		result=D[i];
        		temp=i;
        	}
        	}
        	bw.write(Integer.toString(result)+"\n");
        	go(temp);
        	for(int i=0;i<result;i++) {
        		bw.write(Integer.toString(S.pop()));
        		if(i<result-1) {
        			bw.write(" ");
        		}
        	}
    		
        bw.flush();
        bw.close();
}
    public static void go(int n) {
    	if(n==-1) {
    		return ;
    	}
    	 S.push(I[n]);
    	 go(V[n]);
    }
}

