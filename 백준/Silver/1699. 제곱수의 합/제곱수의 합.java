import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
	public static int D[];
    public static void main(String[]args)throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int num=Integer.parseInt(br.readLine());//배열의 전체길이
        D=new int[num+1];
        for(int i=0;i<=num;i++) {
        	D[i]=100000;
        }
        int count=go(num);
        
    	bw.write(Integer.toString(count));
        bw.flush();
        bw.close();
}
   public static int go(int num) {
	   if(num==0) {
		   return 0;
	   }
	   if(D[num]<100000) {
		   return D[num];
	   }
	   for(int i=1;i<=(int)Math.sqrt(num);i++) {
		   if(D[num]>go(num-i*i)+1) {
			   D[num]=go(num-i*i)+1;
		   }
	   }
	   
	   return D[num];
   }
}

