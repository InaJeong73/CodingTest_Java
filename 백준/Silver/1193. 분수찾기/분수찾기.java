import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        int k=0;
        int sum=0;
        while(num>sum){
            k++;
            sum+=k;
        }
        int num1=num-((k-1)*k/2+1);
        int notStartOne=k;
        int startOne=1;
        for(int i=0;i<num1;i++){
            notStartOne--;
            startOne++;
        }
        if(k%2==0){
        System.out.print(startOne);
        System.out.print("/");
        System.out.print(notStartOne);
        }else{
        System.out.print(notStartOne);
        System.out.print("/");
        System.out.print(startOne);
        }
        }
        
    }