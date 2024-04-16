import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(bf.readLine());
        for(int i=0;i<9;i++){
            System.out.println(num+" * "+(i+1)+" = "+num*(i+1));
        }
    }
}