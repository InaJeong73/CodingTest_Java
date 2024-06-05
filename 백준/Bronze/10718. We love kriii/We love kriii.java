import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("강한친구 대한육군\n강한친구 대한육군");
        bw.flush();
        bw.close();
    }
}