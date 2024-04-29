import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        int[]xArr=new int[num];
        int[]yArr=new int[num];
        for(int i=0;i<num;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            xArr[i]=Integer.parseInt(st.nextToken());
            yArr[i]=Integer.parseInt(st.nextToken());
        }
        int length=findMax(xArr)-findMin(xArr);
        int width=findMax(yArr)-findMin(yArr);
        System.out.print(length*width);
    }
    public static int findMin(int[]numArr){
        int min=100000;
        for(int i=0;i<numArr.length;i++){
            if(numArr[i]<min){
                min=numArr[i];
            }
        }
        return min;
    }
    public static int findMax(int[]numArr){
        int max=-100000;
        for(int i=0;i<numArr.length;i++){
            if(numArr[i]>max){
                max=numArr[i];
            }
        }
        return max;
    }
}