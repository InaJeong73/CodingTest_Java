import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int max=0;
        int num=0;
        int count=0;
        for(int i=0;i<9;i++){
            num=Integer.parseInt(br.readLine());
            if(max<num){
                max=num;
                count=i+1;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}