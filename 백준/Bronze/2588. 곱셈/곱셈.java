import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main{
    public static void main(String[]args)throws Exception{
        int[]numArr=new int[3];
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(bf.readLine());
        String numStr=bf.readLine();
        for(int i=0;i<numStr.length();i++){
           numArr[i]=numStr.charAt(i)-'0';
        }
        int b=Integer.parseInt(numStr);
        System.out.println(a*numArr[2]);
         System.out.println(a*numArr[1]);
         System.out.println(a*numArr[0]);
         System.out.println(a*b);
        
        
    }
}