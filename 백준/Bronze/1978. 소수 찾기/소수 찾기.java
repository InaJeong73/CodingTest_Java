import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int size=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int primeNum=0;
        for(int i=0;i<size;i++){
            int n=Integer.parseInt(st.nextToken());
            if(isPrime(n)==true){
               primeNum++; 
            }
        }
        bw.write(Integer.toString(primeNum));
        bw.flush();
        bw.close();
    }
    public static boolean isPrime(int num){
    	if(num==1) {
    		return false;
    	}
         for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    return false;
                }
            }
        return true;
    }
}