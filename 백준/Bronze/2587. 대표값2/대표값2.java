import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int []numArr=new int[5];
        for(int i=0;i<5;i++){
            numArr[i]=Integer.parseInt(br.readLine());
        }
        int sum=0;
        for(int i=0;i<5;i++){
            sum+=numArr[i];
        }
        int avg=sum/5;
        sort(numArr);
        System.out.println(avg);
        System.out.print(numArr[2]);
    }
    public static void sort(int[]numArr){
        for(int k=0;k<numArr.length;k++){
            for(int i=k+1;i<numArr.length;i++){
                if(numArr[k]>numArr[i]){
                    int temp=numArr[k];
                    numArr[k]=numArr[i];
                    numArr[i]=temp;
                }
            }
        }
    }
}