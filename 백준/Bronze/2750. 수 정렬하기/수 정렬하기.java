import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        int[]numArr=new int[num];
        for(int i=0;i<num;i++){
            numArr[i]=Integer.parseInt(br.readLine());
        }
        for(int k=0;k<num;k++){
        for(int i=k+1;i<num;i++){
            if(numArr[k]>numArr[i]){
                int temp=numArr[k];
                numArr[k]=numArr[i];
                numArr[i]=temp;
                }
            }
        }
        for(int i=0;i<num;i++){
            if(i==num-1){
               System.out.print(numArr[i]);
            }else{
            System.out.println(numArr[i]);
            }
        }
    }
}