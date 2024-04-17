import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int basketNum=Integer.parseInt(st.nextToken());
        int exchangeNum=Integer.parseInt(st.nextToken());
        int[]baskets=new int[basketNum];
        for(int i=0;i<basketNum;i++){
            baskets[i]=i+1;
        }
        for(int k=0;k<exchangeNum;k++){
            StringTokenizer st1=new StringTokenizer(br.readLine());
            int i=Integer.parseInt(st1.nextToken());
            int j=Integer.parseInt(st1.nextToken());
            int temp=baskets[i-1];
            baskets[i-1]=baskets[j-1];
            baskets[j-1]=temp;
        }
        for(int i=0;i<baskets.length;i++){
            System.out.print(baskets[i]);
            if(i<baskets.length-1){
                System.out.print(" ");
            }
        }
        
    }
}