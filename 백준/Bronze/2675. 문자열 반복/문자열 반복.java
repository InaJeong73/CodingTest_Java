import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        for(int i=0;i<num;i++){
        StringTokenizer st=new StringTokenizer(br.readLine());
        int repeat=Integer.parseInt(st.nextToken());
        String str=st.nextToken();
        for(int j=0;j<str.length();j++){
            for(int p=0;p<repeat;p++){
                System.out.print(""+str.charAt(j));
            }
        }
        System.out.println("");
        }
        
    }
}