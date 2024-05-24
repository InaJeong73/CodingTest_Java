import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main{
	public static int[]d=new int [1001];
    public static void main(String[]args)throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int num=Integer.parseInt(br.readLine());
        bw.write(Integer.toString(go(num)));
        bw.flush();
        bw.close();
}
    public static int go(int num) {
    	if(num==1) {
    		d[num]=1;
    		return d[num];
    	}
    	if(num==2){
    		d[num]=3;
    		return d[num];
    	}
    	if(d[num]>0)return d[num];
    	d[num]=go(num-1)+2*go(num-2);
        d[num]%=10007;
    	return d[num];
    }
}


