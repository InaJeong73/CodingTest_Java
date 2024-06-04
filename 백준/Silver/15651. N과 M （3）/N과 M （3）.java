import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
	public static int[]answer;
	public static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	public static int initialValue=0;
	public static void main(String[]args)throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		answer=new int[M];//답을 작성하는 배열
		go(0,N,M);
			
		bw.flush();
		bw.close();
	}
	//answer의 index번째 요소를 채우는 함수
	public static void go(int index,int n,int m)throws Exception{
		if(index==m) {
			for(int i=0;i<m;i++) {
				bw.write(Integer.toString(answer[i]));
				if(i<m-1)bw.write(" ");
				if(i==m-1)bw.write("\n");
			}
			return;
		}
		for(int i=1;i<=n;i++) {
				answer[index]=i;
				go(index+1,n,m);
		}
	}
}