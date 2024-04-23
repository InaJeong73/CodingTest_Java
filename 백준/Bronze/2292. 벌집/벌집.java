import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        int i=0,k=0;
        while(num>6*k+1){
            i++;
            k+=i;
        }
        System.out.print(i+1);
    }
}