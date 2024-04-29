import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        int[]numArr=new int[N];
        for(int i=0;i<N;i++){
            numArr[i]=Integer.parseInt(st.nextToken());
        }
         sort(numArr);
        System.out.print(numArr[k-1]);
    }
    public static void sort(int[]numArr){
        for(int k=0;k<numArr.length;k++){
            for(int i=k+1;i<numArr.length;i++){
                if(numArr[k]<numArr[i]){
                    int temp=numArr[k];
                    numArr[k]=numArr[i];
                    numArr[i]=temp;
                }
            }
        }
    }
}