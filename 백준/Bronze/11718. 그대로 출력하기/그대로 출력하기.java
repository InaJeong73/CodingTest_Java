import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<String>strList=new ArrayList<String>();
        String line;
        while((line=br.readLine())!=null){
           strList.add(line);
        }
	    for(int i=0;i<strList.size();i++){
            if(i!=strList.size()-1){
                bw.write(strList.get(i)+"\n");
            }else{
                bw.write(strList.get(i));
            }
        }
        bw.close();
    }
}