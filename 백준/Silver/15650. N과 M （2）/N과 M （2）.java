import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
	public static boolean []check;
	public static int[]answer;
	public static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	public static int initialValue=0;
	public static void main(String[]args)throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		check=new boolean[N+1];//해당 숫자가 선택됐는지 아닌지 점검하는 배열
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
			if(check[i]==true)continue;
			if(index==0) {
			answer[index]=i;
			check[i]=true;
			go(index+1,n,m);
			}
			if(index>0&&answer[index-1]<i) {
				answer[index]=i;
				check[i]=true;
				go(index+1,n,m);
				}
			check[i]=false;
		}
	}
}