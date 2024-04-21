import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int rowNum=Integer.parseInt(st.nextToken());
        int colNum=Integer.parseInt(st.nextToken());
        int[][]arr1=new int[rowNum][colNum];
        int[][]arr2=new int[rowNum][colNum];
        int[][]sumArr=new int[rowNum][colNum];
        
        for(int i=0;i<rowNum;i++){
            StringTokenizer st1=new StringTokenizer(br.readLine());
            for(int j=0;j<colNum;j++){
                arr1[i][j]=Integer.parseInt(st1.nextToken());
            }
        }
        for(int i=0;i<rowNum;i++){
            StringTokenizer st2=new StringTokenizer(br.readLine());
            for(int j=0;j<colNum;j++){
                arr2[i][j]=Integer.parseInt(st2.nextToken());
            }
        }
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                sumArr[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                System.out.print(sumArr[i][j]);
                if(j<colNum-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}