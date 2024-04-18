import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int[]numArr=new int[10];
        int num=0;
        for(int i=0;i<10;i++){
            numArr[i]= Integer.parseInt(br.readLine())%42;
        }
        ArrayList<Integer>numAL=new ArrayList<Integer>();
        for(int i=0;i<numArr.length;i++){
            num=numArr[i];
            while(true){
              if(!numAL.contains(num)){
                  numAL.add(num);
              }else{
                  break;
              } 
            }
            }
        System.out.print(numAL.size());
        }
    }
      
