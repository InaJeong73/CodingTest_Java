import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        String str=st.nextToken();
        int num=Integer.parseInt(st.nextToken());
        int multiple=1;
        int result=0;
        for(int i=str.length()-1;i>=0;i--){
        int k=0;
        char c=str.charAt(i);
        if((int)c>=48&&(int)c<=57){
            k=c-'0';
        }else if((int)c>=65&&(int)c<=90){
            k=(int)c-55;
        }else{
            continue;
        }
        result=result+multiple*k;
        multiple*=num;
    }
        System.out.print(result);
}
}