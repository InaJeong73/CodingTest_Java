import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine());
        
        for(int i=0;i<T;i++){
            int count=0;
            int N=Integer.parseInt(br.readLine());
            ArrayList<Integer>minorities=calMinorities(N);
            HashSet<Integer>minoritySet=new HashSet<>(minorities);
            for(int j=0;j<=minorities.size();j++){
            	if(minorities.get(j)>(N/2))break;
                if(minoritySet.contains(N-minorities.get(j))){
                    count++;
                }
            }
            bw.write(Integer.toString(count));
            if(i<T-1){
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
    }
    public static ArrayList<Integer> calMinorities(int n){
        ArrayList<Integer>minorities=new ArrayList<Integer>();
        boolean[]isErase=new boolean[n+1];
        for(int i=2;i*i<=n;i++){
            if(!isErase[i]){
                for(int j=i*i;j<=n;j+=i){
                isErase[j]=true;
                }
            }
        }
        for(int i=2;i<n+1;i++){
            if(!isErase[i]){
                minorities.add(i);
            }
        }
        return minorities;
    } 
}