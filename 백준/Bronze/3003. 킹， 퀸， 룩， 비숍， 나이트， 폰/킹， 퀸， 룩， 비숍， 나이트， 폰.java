import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int[]correctChessNum={1,1,2,2,2,8};
        int[]chess=new int[6];
        for(int i=0;i<chess.length;i++){
         chess[i]=Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<chess.length;i++){
            System.out.print(correctChessNum[i]-chess[i]);
            if(i<chess.length-1){
                System.out.print(" ");
            }
        }
        
        
    }
}