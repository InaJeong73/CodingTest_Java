import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char[][]charArr=new char[5][15];
        int length_max=0;
        for(int i=0;i<5;i++){
            String str=br.readLine();
            int length=str.length();
            if(length_max<length){
                length_max=length;
            }
            for(int j=0;j<length;j++){
                charArr[i][j]=str.charAt(j);
            }
        }
        
        for(int i=0;i<length_max;i++){
            for(int j=0;j<5;j++){
                if(charArr[j][i]==0)continue;
                System.out.print(charArr[j][i]);
            }
        }
        
        
    }
}