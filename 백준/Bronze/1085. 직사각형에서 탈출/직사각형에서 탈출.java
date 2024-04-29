import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int x=Integer.parseInt(st.nextToken());
        int y=Integer.parseInt(st.nextToken());
        int w=Integer.parseInt(st.nextToken());
        int h=Integer.parseInt(st.nextToken());
        int[]intArr={x,y,h-y,w-x};
        int min=1000;
        for(int i=0;i<intArr.length;i++){
            if(intArr[i]<min){
                min=intArr[i];
            }
        }
        System.out.print(min);
    }
}