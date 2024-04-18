import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        for(int i='a';i<='z';i++){
            boolean isContain=false;
            for(int j=0;j<str.length();j++){
                if((int)str.charAt(j)==i){
                    isContain=true;
                    System.out.print(j);
                    if(i!='z'){
                        System.out.print(" ");
                    }
                    break;
                }
            }
            if(isContain==false){
            System.out.print("-1");
            if(i!='z'){
                        System.out.print(" ");
                    }
            }
        }
    }
}