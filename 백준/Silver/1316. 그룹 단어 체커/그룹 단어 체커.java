import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in) );
        int num=Integer.parseInt(br.readLine());
        int count=0;
        ArrayList<Character>banList;
        for(int i=0;i<num;i++){
            boolean isGroupVoca=true;
            String str=br.readLine();
            banList=new ArrayList<Character>();
            for(int j=0;j<str.length();j++){
            char currentChar=str.charAt(j);
            if(banList.contains(currentChar)){
                isGroupVoca=false;
                break;
            }
            char nextChar=(j+1<str.length())?str.charAt(j+1):'\0';
            if(currentChar!=nextChar){
                banList.add(currentChar);
            }else{
                do{
                j++;
                nextChar=(j+1<str.length())?str.charAt(j+1):'\0';
                }while(nextChar==currentChar);
                banList.add(currentChar);
            }
            }
            if(isGroupVoca==true){
               count++; 
            }          
        }
        System.out.print(count);
    }
}