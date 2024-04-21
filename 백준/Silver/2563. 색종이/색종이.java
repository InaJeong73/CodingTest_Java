import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int smallPaperNum=Integer.parseInt(br.readLine());
        int[][]bigPaper=new int[100][100];
        int totalArea=0;
        for(int n=0;n<smallPaperNum;n++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int startRow=Integer.parseInt(st.nextToken());
            int startCol=Integer.parseInt(st.nextToken());
            for(int i=startRow;i<startRow+10;i++){
                for(int j=startCol;j<startCol+10;j++){
                bigPaper[i][j]=1;
            }
        }
    }
         for(int i=0;i<100;i++){
                for(int j=0;j<100;j++){
                totalArea+=bigPaper[i][j];
            }
        }
        System.out.print(totalArea);
}
}