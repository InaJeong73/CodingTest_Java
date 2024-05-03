import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.ArrayList;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        Stack <Integer> stack=new Stack<Integer>();
        ArrayList<Character>charArr=new ArrayList<Character>();
        int num=Integer.parseInt(br.readLine());
        boolean success=true;
        int k=1;
        for(int i=0;i<num;i++){
            int n=Integer.parseInt(br.readLine());
            if(stack.isEmpty()||stack.peek()<n){
                while(k<=n){
                    stack.push(k);
                    charArr.add('+');
                    k++;
                }
            }
            if(stack.peek()==n){
                stack.pop();
                charArr.add('-');
            }else if(stack.peek()>n){
                success=false;
                break;
            }
        }
        if(!success){
            bw.write("NO");
        }else{
            for(int i=0;i<charArr.size();i++){
                if(i==charArr.size()-1){
                    bw.write(charArr.get(i));
                }else{
                    bw.write(charArr.get(i)+"\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}