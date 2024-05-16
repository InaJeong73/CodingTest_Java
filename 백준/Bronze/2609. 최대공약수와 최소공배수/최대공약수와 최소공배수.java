import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	public static int num1,num2,minNum,maxDivisor;
	public static int minDivisor=1;
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(bf.readLine()," ");
		int[]arr=new int [2];
		arr[0]=Integer.parseInt(st.nextToken()) ;
		arr[1]=Integer.parseInt(st.nextToken()) ;
		Arrays.sort(arr);
		for(int i=1;i<=arr[0];i++) {
			if(arr[0]%i==0&&arr[1]%i==0){
				minDivisor*=i;
				arr[0]=arr[0]/i;
				arr[1]=arr[1]/i;
				i=1;
			}
		}
		maxDivisor=minDivisor*arr[0]*arr[1];
		System.out.println(minDivisor);
		System.out.println(maxDivisor);
		
	}

}
