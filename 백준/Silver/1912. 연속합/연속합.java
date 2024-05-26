import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
	public static int[]S;
	public static int[]D;
	public static int num;
    public static void main(String[]args)throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        num=Integer.parseInt(br.readLine());//배열의 전체길이
        StringTokenizer st=new StringTokenizer(br.readLine());
        S=new int[num];
        D=new int[num];
        
        for(int i=0;i<num;i++){
        	D[i]=Integer.parseInt(st.nextToken());
        }
        int result=0;
        if(num==1) {
        	result=D[0];
        }else{
        	go(0);
        	result=Integer.MIN_VALUE;
        	for(int i=0;i<num;i++) {
        	if(result<S[i]) {	
        		result=S[i];
        	}
        	}
        }
    	bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
}
    public static void go(int n) {
    	if(n==0) {
    		S[n]=D[n];
    		go(n+1);
    		return;
    	}
    	if(S[n-1]+D[n]>=D[n]) {
    		S[n]=S[n-1]+D[n];
    	}else {
    		S[n]=D[n];
    	}
    	if(n==num-1) {
    		return;
    	}
    	 go(n+1);
    }
}

