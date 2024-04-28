import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int M=Integer.parseInt(br.readLine());
        int N=Integer.parseInt(br.readLine());
        ArrayList<Integer>intArr=new ArrayList<Integer>();
        for(int i=M;i<=N;i++){
            if(isPrime(i)==true){
                intArr.add(i);
            }
        }
        if(intArr.size()==0){
            System.out.println("-1");
        }else{
        int sum=0;
        for(int i=0;i<intArr.size();i++){
            sum+=intArr.get(i);
        }
        System.out.println(sum);
        System.out.print(intArr.get(0));
        }
        
    }
    public static boolean isPrime(int num){
        if(num<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}