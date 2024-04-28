import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static String[]str;
	public static int count=0;
	public static int len=2;
public static void main(String[]args) throws IOException {
	
	str=new String[2];
	
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	str=bf.readLine().split(" ",len);
	
		int N=Integer.parseInt(str[0]);
		int K=Integer.parseInt(str[1]);
	
	for(int i=1;i<=N;i++) {
		if(N%i==0) {
			count++;
		}
		if(count==K) {
			System.out.println(i);
			break;
		}
	}
	if(count<K) {
		System.out.println(0);
	}
	}	
}
