import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int num=Integer.parseInt(br.readLine());
        int divisionNum=1;
        int ZeroNum=0;
        while(divisionNum<=num){
             divisionNum*=5;
            ZeroNum+=num/divisionNum;
        }
        bw.write(Integer.toString(ZeroNum));
        bw.flush();
        bw.close();
        }
    }
