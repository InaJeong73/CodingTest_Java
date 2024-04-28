import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int num,N=0,count;
	public static int[]arr;

	public static void main(String[] args) throws NumberFormatException,IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		num=Integer.parseInt(bf.readLine());
		
		arr=new int[num];
		StringTokenizer st=new StringTokenizer(bf.readLine()," ");
		for(int i=0;i<num;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		for(int i=0;i<num;i++) {
			count=0;
			for(int k=1;k<=arr[i];k++) {
			if(arr[i]%k==0) {
				count++;
			}
		}
			if(count==2)
			{
				N++;
			}
		}
		System.out.println(N);
	}
}
