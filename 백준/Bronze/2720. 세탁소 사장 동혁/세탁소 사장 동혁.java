import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        for(int i=0;i<num;i++){
            int cent=Integer.parseInt(br.readLine());
                       
            int quarter=cent/25;
            cent=cent%25;
            
            int dime=cent/10;
            cent=cent%10;
            
             int nickel=cent/5;
            cent=cent%5;
            
             int penny=cent;
           
           System.out.println(quarter+" "+dime+" "+nickel+" "+penny);
        }
    }
}