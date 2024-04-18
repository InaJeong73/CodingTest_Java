import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int basketsNum=Integer.parseInt(st.nextToken());
        int count=Integer.parseInt(st.nextToken());
        ArrayList<Integer>baskets=new ArrayList<Integer>();
       
        for(int i=0;i<basketsNum;i++){
            baskets.add(i+1);
        }
        
        for(int k=0;k<count;k++){
            StringTokenizer st1=new StringTokenizer(br.readLine());
            int i=Integer.parseInt(st1.nextToken());
            int j=Integer.parseInt(st1.nextToken());
            ArrayList<Integer>tempNums=new ArrayList<Integer>();
            
            for(int p=i-1;p<j;p++){
              tempNums.add(baskets.get(p));
            }
            int index=i-1;
            for(int p=tempNums.size()-1;p>=0;p--){
                baskets.set(index++,tempNums.remove(p));
            }
        }
            for(int p=0;p<baskets.size();p++){
                System.out.print(baskets.get(p));
                if(p!=baskets.size()-1){
                 System.out.print(" ");
                }
            }
    }
}