import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int num=Integer.parseInt(br.readLine()); 
        while(true){
           if(num==-1)break;
           ArrayList <Integer>numArr=new ArrayList<Integer>();
           int sum=0;
            for(int i=1;i<num;i++){
                if(num%i==0){
                    sum+=i;
                    numArr.add(i);
                }
            }
            if(sum==num){
                 System.out.print(num+" = ");
                int i=0;
                while(i<numArr.size()){
                    if(i==0){
                         System.out.print(numArr.get(i));
                    }else{
                        System.out.print(" + "+numArr.get(i));
                    }
                    i++;
                    }
                }else{
                System.out.print(num+" is NOT perfect.");
            }
           num=Integer.parseInt(br.readLine());
            if(num!=-1){
                 System.out.println("");
            }
            }
        }
    }