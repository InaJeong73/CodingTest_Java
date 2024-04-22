import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int B=Integer.parseInt(st.nextToken());
        ArrayList<Integer>numArr=new ArrayList<Integer>();
        
        while(N!=0){
            numArr.add(N%B);
            N=N/B;
        }
        for(int i=numArr.size()-1;i>=0;i--){
           if(numArr.get(i)>=0&&numArr.get(i)<10){
               System.out.print(numArr.get(i));
           }else if(numArr.get(i)>=10&&numArr.get(i)<36){
               int ascii=numArr.get(i).intValue()+55;
               char c=(char)ascii;
               System.out.print(c);
           }
        }
    }
}