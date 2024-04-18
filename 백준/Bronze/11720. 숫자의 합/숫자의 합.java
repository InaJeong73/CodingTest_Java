import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        int[]numArr=new int[num];
        String str=br.readLine();
        for(int i=0;i<num;i++){
            numArr[i]=str.charAt(i)-'0';
        }
        int sum=0;
        for(int i=0;i<numArr.length;i++){
            sum+=numArr[i];
        }
        System.out.print(sum);
    }
}