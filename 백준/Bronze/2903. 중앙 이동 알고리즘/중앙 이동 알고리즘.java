import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        int k=2;
        for(int i=0;i<num;i++){
           k=k*2-1;
        }
        System.out.print(k*k);
    }
}