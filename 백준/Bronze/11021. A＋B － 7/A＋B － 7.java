 import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int count=Integer.parseInt(bf.readLine());
        int num1=0;
        int num2=0;
        int sum=0;
        for(int i=0;i<count;i++){
            StringTokenizer st=new StringTokenizer(bf.readLine());
            num1=Integer.parseInt(st.nextToken());
            num2=Integer.parseInt(st.nextToken());
            sum=num1+num2;
            int num=i+1;
            System.out.println("Case #"+num+": "+sum);
        }
    }
}