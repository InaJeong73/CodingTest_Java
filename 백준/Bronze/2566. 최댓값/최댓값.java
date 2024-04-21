import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int[][]gridPlate=new int[9][9];
        int max=0;
        int row=0;
        int col=0;
        for(int i=0;i<9;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int j=0;j<9;j++){
                gridPlate[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(max<gridPlate[i][j]){
                    max=gridPlate[i][j];
                    row=i+1;
                    col=j+1;
                }
            }
        }
        if(max==0){
            row=1;
            col=1;
        }
        System.out.println(max);
        System.out.print(row+" "+col);
        
    }
}