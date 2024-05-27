import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
//천만까지의 모든 숫자에 대해서 목표 채널까지 가려면 버튼을 몇번 눌러야하는지 계산하고 구한 횟수들의 최솟값을 출력한다. 
public class Main{
	public static boolean[]broken=new boolean[10];
    public static void main(String[]args)throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int goal=Integer.parseInt(br.readLine());
        
        for(int i=0;i<10;i++) {
        	broken[i]=true;
        }
        int breakDownNum=Integer.parseInt(br.readLine());
        if(breakDownNum!=0) {
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<breakDownNum;i++) {
        	broken[Integer.parseInt(st.nextToken())]=false;
        }
        }
        if(goal==100) {
       	 bw.write(Integer.toString(0));
       }else {
        int press=goal-100;
        if(press<0)press=-press;
        for(int i=0;i<1000000;i++) {
        	if(possible(i)!=0) {
        		int len=possible(i);
        		int button=goal-i;
        		if(button<0)button=-button;
        		if(len+button<press)press=len+button;
        	}
        }
        bw.write(Integer.toString(press));
       }
        bw.flush();
        bw.close();
}
    public static int possible(int n) {
    	if(n==0) {
    		if(!broken[n])return 0;
    		else return 1;
    	}
    	int len=0;
    	while(n>0) {
    		if(broken[n%10]==false)return 0;
    		len++;
    		n/=10;
    	}
    	return len;
    }
}

