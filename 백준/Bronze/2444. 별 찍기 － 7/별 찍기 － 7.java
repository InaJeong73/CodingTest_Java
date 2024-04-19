import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int num=Integer.parseInt(br.readLine());
        for(int i=0;i<num;i++){
            for(int j=0;j<num-i-1;j++){
                bw.write(" ");
            }
            for(int j=0;j<2*(i+1)-1;j++){
                bw.write("*");
            }
             bw.write("\n");
        }
        for(int i=0;i<num-1;i++){
           for(int j=0;j<i+1;j++){
                bw.write(" ");
            }
            for(int j=0;j<2*num-2*i-3;j++){
                bw.write("*");            
                }
            if(i<num-2){
            bw.write("\n");
            }
        }
        bw.close();
    }
}