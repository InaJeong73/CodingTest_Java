import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        ArrayList<Character>charArr=new ArrayList<Character>();
        char[]charArr1=new char[str.length()];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch)){
               ch=Character.toLowerCase(ch);
            }
            charArr1[i]=ch;
            if(!charArr.contains(ch)){
                charArr.add(ch);
            }
        }
        int[]countArr=new int[charArr.size()];
        for(int i=0;i<charArr.size();i++){
            countArr[i]=0;
            char ch=charArr.get(i);
            for(int j=0;j<charArr1.length;j++){
                if(ch==charArr1[j]){
                    countArr[i]++;
                }
            }
        }
        int max=0;
        int num=0;
        for(int i=0;i<countArr.length;i++){
          if(countArr[i]>max){
              max=countArr[i];
              num=i;
          }
        }
        int count=0;
        for(int i=0;i<countArr.length;i++){
             if(countArr[i]==max){
                 count++;
             }
        }
        if(count>1){
            System.out.print("?");
        }else{
            char ch1=charArr.get(num);
            System.out.print(Character.toUpperCase(ch1));
        }
    }
}