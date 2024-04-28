import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[]args)throws Exception{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      String line;
        while((line=br.readLine())!=null){
            StringTokenizer st=new StringTokenizer(line);
            int num1=Integer.parseInt(st.nextToken());
            int num2=Integer.parseInt(st.nextToken());
            if(num1==0&&num2==0)break;
            if(num1<num2&&num2%num1==0){
                System.out.println("factor");
            }else if(num1>num2&&num1%num2==0){
                 System.out.println("multiple");
            }else{
                System.out.println("neither");
            }
    }
}
}