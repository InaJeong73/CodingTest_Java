import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main{
	public static int[]numArr;
	public static int[]answer;
	public static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	public static int initialValue=0;
	public static void main(String[]args)throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());//고를 수 있는 자연수의 개수
		int M=Integer.parseInt(st.nextToken());//배열의 길이
		st=new StringTokenizer(br.readLine());
		numArr=new int[N];//고를 수 있는 자연수들의 모음
		answer=new int[M];//답을 작성하는 배열
		for(int i=0;i<N;i++) {
			numArr[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(numArr);
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
		for(int i=0;i<n;i++) {
			if(index==0) {
				answer[index]=numArr[i];
				go(index+1,n,m);
			}
			if(index!=0&&answer[index-1]<=numArr[i]) {
			answer[index]=numArr[i];
			go(index+1,n,m);
			}
		}
		}
	}
