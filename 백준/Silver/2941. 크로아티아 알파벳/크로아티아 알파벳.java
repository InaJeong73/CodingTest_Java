import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            char currentChar=str.charAt(i);
            char nextChar=(i+1<str.length())?str.charAt(i+1):'\0';
            switch(currentChar){
                case'c':{
                    if(nextChar=='='||nextChar=='-'){
                       i++;
                    }
                    break;
                }
                case'd':{
                    if(nextChar=='-'){
                        i++;
                    }else if(nextChar=='z'&&i+2<str.length()&&str.charAt(i+2)=='='){
                            i+=2;
                    }
                    break;
                }
                case 'l':
                case 'n':{
                    if(nextChar=='j'){
                       i++;
                    }
                    break;
                }
                case 's':
                case 'z':{
                    if(nextChar=='='){
                       i++;
                    }
                    break;
                }    
            }
            count++;
        }
         System.out.print(count);
    }
}