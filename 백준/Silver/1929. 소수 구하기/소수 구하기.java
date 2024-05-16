import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int M=Integer.parseInt(st.nextToken());
        int N=Integer.parseInt(st.nextToken());
        boolean[] check=new boolean[N+1];
        for(int i=2;i<=N;i++) {
            if(check[i]==false){
                for(int j=i*2;j<=N;j+=i){
                    check[j]=true;
                }
            }
        }
        for(int i=M;i<=N;i++){
            if(i>1 && !check[i]){
               bw.write(Integer.toString(i)+"\n");
            }
        }
       bw.flush();
       bw.close();
    }
}
