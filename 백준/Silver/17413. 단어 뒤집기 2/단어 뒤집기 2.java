import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        ArrayList<Character>charArr=new ArrayList<Character>();
        boolean isInSpecialChar=false;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='<'){
              isInSpecialChar=true;
              StringBuilder sb = new StringBuilder();
              for (char ch : charArr) {
                  sb.append(ch);
              }
              System.out.print(sb.reverse());
              charArr.clear();
              System.out.print(c);
              continue;
            }else if(c=='>'){
                isInSpecialChar=false;
                System.out.print(c);
                continue;
            }else if(c==' '){
            	 StringBuilder sb = new StringBuilder();
                 for (char ch : charArr) {
                     sb.append(ch);
                 }
                 System.out.print(sb.reverse());
                charArr.clear();
                System.out.print(c);
                continue;
            }
            else {
            if(isInSpecialChar==false){
               charArr.add(c);  
               if(i==str.length()-1) {
            	   StringBuilder sb = new StringBuilder();
                   for (char ch : charArr) {
                       sb.append(ch);
                   }
                   System.out.print(sb.reverse());
                   charArr.clear();
               }
                }
            else if(isInSpecialChar==true){
                System.out.print(c);
            }
           
            }
        }
        }
    
    }