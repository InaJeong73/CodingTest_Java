import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int totalPrice=Integer.parseInt(bf.readLine());
        int numOfType=Integer.parseInt(bf.readLine());
        int sum=0;
        int price=0;
        int count=0;
        
        for(int i=0;i<numOfType;i++){
            StringTokenizer st=new StringTokenizer(bf.readLine());
            price=Integer.parseInt(st.nextToken());
            count=Integer.parseInt(st.nextToken());
            sum+=price*count;
        }
        if(sum==totalPrice){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}