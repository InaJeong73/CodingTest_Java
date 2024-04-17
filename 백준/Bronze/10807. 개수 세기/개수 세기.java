import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int length=Integer.parseInt(br.readLine());
        String numStr=br.readLine();
        int search=Integer.parseInt(br.readLine());
        
        int num=0;
        int count=0;
        
        StringTokenizer st=new StringTokenizer(numStr);
        for(int i=0;i<length;i++){
            num=Integer.parseInt(st.nextToken());
            if(num==search){
                count++;
            }
        }
        bw.write(Integer.toString(count));
        bw.close();
    }
}