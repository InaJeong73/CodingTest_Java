import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[]args)throws Exception{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
        int A=Integer.parseInt(br.readLine());
        int B=Integer.parseInt(br.readLine());
        int C=Integer.parseInt(br.readLine());
        int sum=A+B+C;
        
        if(A==60&&B==60&&C==60){
            System.out.print("Equilateral");
        }
        else if(sum==180&&(A==B||A==C||B==C)){
             System.out.print("Isosceles");
            }
        else if(sum==180&&(A!=B&&B!=C&&C!=A)){
             System.out.print("Scalene");
        }else{
             System.out.print("Error");
        }
        }
    }
