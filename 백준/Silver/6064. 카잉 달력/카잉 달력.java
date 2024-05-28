
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[]args)throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int M=0;
		int N=0;
		int x=0;
		int y=0;
		int no=-1;
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			M=Integer.parseInt(st.nextToken());
			N=Integer.parseInt(st.nextToken());
			x=Integer.parseInt(st.nextToken());
			y=Integer.parseInt(st.nextToken());
			x--;
			y--;
			boolean ok=false;
			for(int k=x;k<(M*N);k+=M) {
				if(k%N==y) {
					bw.write(Integer.toString(k+1));
					ok=true;
					break;
				}
			}
			if(!ok) {
				bw.write(Integer.toString(no));
			}
			if(i<n-1) {
				bw.write("\n");
			}
			
		}
		
		bw.flush();
		bw.close();
		
		
				}
}