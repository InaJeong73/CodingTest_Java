import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int[]xArr=new int[3];
        int[]yArr=new int[3];
        for(int i=0;i<3;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            xArr[i]=Integer.parseInt(st.nextToken());
            yArr[i]=Integer.parseInt(st.nextToken());
        }
       int x=searchCoordinates(xArr);
       int y=searchCoordinates(yArr);
       System.out.print(x+" "+y);
    }
    public static int searchCoordinates(int[]numArr){
        int count=0;
        int num=0;
        for(int i=1;i<numArr.length;i++){
            if(numArr[0]==numArr[i])
                count++;
            else{
                num=numArr[i];
            }
        }
        if(count==0)return numArr[0];
        else  return num;
    }
    
    
    
}