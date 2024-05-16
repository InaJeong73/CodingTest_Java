import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int num=Integer.parseInt(br.readLine());
        for(int i=0;i<num;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int num1=Integer.parseInt(st.nextToken());
            int num2=Integer.parseInt(st.nextToken());
            int gcd=GCD(num1,num2);
            int lcm=num1*num2/gcd;
            bw.write(Integer.toString(lcm)+"\n");
        }
        bw.flush();
        bw.close();
    }
    public static int GCD(int a, int b){
        if(b==0){
            return a;
        }else{
            return GCD(b,a%b);
        }
    }
}