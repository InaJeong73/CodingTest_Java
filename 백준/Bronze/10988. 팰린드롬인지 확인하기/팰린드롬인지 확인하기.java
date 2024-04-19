import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        int num=str.length();
        char[]inverseStr=new char[num];
        int index=num-1;
        for(int i=0;i<num;i++){
                inverseStr[index]=str.charAt(i);
                index--;
            }
        String newStr=new String(inverseStr);        
        if(str.equals(newStr)){
            System.out.print("1");
        }else{
            System.out.print("0");
        }
    }
}