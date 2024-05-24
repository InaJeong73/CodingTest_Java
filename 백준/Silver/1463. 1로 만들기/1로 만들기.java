import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main{
	public static int[]d=new int [1000001];
    public static void main(String[]args)throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int num=Integer.parseInt(br.readLine());
        bw.write(Integer.toString(go(num)));
        bw.flush();
        bw.close();
}
    public static int go(int num) {
    	if(num==1)return 0;
    	if(d[num]>0)return d[num];
    	d[num]=go(num-1)+1;
    	if(num%2==0) {
    		int temp=go(num/2)+1;
    		if(d[num]>temp)d[num]=temp;
    	}
    	if(num%3==0) {
    		int temp=go(num/3)+1;
    		if(d[num]>temp)d[num]=temp;
    	}
    	return d[num];
    	
    }
}