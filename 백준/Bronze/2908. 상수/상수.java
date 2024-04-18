import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int[]numArr=new int[2];
        for(int i=0;i<2;i++){
          char[]charArr=new char[3];
          String str= st.nextToken();
          int p=0;
          for(int j=str.length()-1;j>=0;j--){
              charArr[p]=str.charAt(j);
              p++;
              }
          String reverseStr=new String(charArr);
          numArr[i]=Integer.parseInt(reverseStr);
        }
        if(numArr[0]>numArr[1]){
            System.out.print(numArr[0]);
        }else{
            System.out.print(numArr[1]);
        }
    }
}