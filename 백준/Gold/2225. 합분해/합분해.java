import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
	public static int D[][];
	public final static int n=1000000000;
    public static void main(String[]args)throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int num=Integer.parseInt(st.nextToken());//배열의 전체길이
        int k=Integer.parseInt(st.nextToken());
        D=new int[num+1][k+1];
        
        int result=go(num,k);
        
    	bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
}
   public static int go(int num,int k) {
	   if(k==1) {
		   return 1;
	   }
	   if(num==0) {
		   return 1;
	   }
	   if(D[num][k]>0) {
		   return D[num][k];
	   }
	   for(int i=0;i<=num;i++) {
		   D[num][k]+=go(num-i,k-1)%n;
		   D[num][k]%=n;
	   }
	   return D[num][k]%n;
   }
}

