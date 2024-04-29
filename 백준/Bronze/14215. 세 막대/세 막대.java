import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        int c=Integer.parseInt(st.nextToken());
        int[]intArr={a,b,c};
        int max=0;
        int k=0;
        for(int i=0;i<intArr.length;i++){
            if(intArr[i]>max){
                max=intArr[i];
                k=i;
            }
        }
        int sum=0;
        for(int i=0;i<intArr.length;i++){
            if(i!=k){
                sum+=intArr[i];
            }
        }
        if(sum<=max){
            max=sum-1;
        }
        System.out.print(sum+max);
    }
}