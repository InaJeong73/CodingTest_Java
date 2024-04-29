import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        while(!str.equals("0 0 0")){
            StringTokenizer st=new StringTokenizer(str);
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            int c=Integer.parseInt(st.nextToken());
            if(!isTriangle(a,b,c)){
                System.out.print("Invalid");
            }else{
                if(a==b&&b==c){
                System.out.print("Equilateral");
                }else if(a==b||b==c||c==a){
                System.out.print("Isosceles");
                }else{
                System.out.print("Scalene");
                }
            }
            str=br.readLine();
            if(!str.equals("0 0 0")){
                System.out.println();
            }
        }
    }
    public static boolean isTriangle(int a,int b,int c){
        int[]numArr={a,b,c};
        int max=0;
        int sum=0;
        int k=0;
        for(int i=0;i<numArr.length;i++ ){
            if(numArr[i]>max){
                max=numArr[i];
                k=i;
            }
        }
        for(int i=0;i<numArr.length;i++){
           if(i!=k){
               sum+=numArr[i];
           }
        }
        if(sum>max){
            return true;
        }else return false;
    }
}