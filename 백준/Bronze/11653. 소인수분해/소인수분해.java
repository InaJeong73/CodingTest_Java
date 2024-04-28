import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        int i=2;
        while(num!=1){
            if(num%i==0){
                num/=i;
                if(num==1){
                    System.out.print(i);
                }else{
                System.out.println(i);
                }
            }else{
                i++;
            }
            
        }
    }
}