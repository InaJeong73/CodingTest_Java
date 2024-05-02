import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main{
    public static ArrayList<Integer>numArr=new ArrayList<Integer>();
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int cmdNum=Integer.parseInt(br.readLine());
        for(int i=0;i<cmdNum;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            
            String cmd=st.nextToken();
            if(cmd.equals("push")){
                int num=Integer.parseInt(st.nextToken());
                push(num);
            }else if(cmd.equals("pop")){
                if(i==cmdNum-1){
                    System.out.print(pop());
                }else
                    System.out.println(pop());
            }else if(cmd.equals("top")){
                if(i==cmdNum-1){
                    System.out.print(top());
                }else
                     System.out.println(top());
            }else if(cmd.equals("size")){
                 if(i==cmdNum-1){
                    System.out.print(numArr.size());
                }else
                     System.out.println(numArr.size());
            }else if(cmd.equals("empty")){
                if(i==cmdNum-1){
                    System.out.print(isEmpty());
                }else
                 System.out.println(isEmpty());
            }else{
                continue;
            }
            
           
        }
    }
    public static void push(int num){
        numArr.add(num);
    }
    public static int pop(){
        if(isEmpty()==1){
            return -1;
        }else{
        return numArr.remove(numArr.size()-1);
        }
    }
    public static int top(){
        if(isEmpty()==1){
            return -1;
        }else{
        return numArr.get(numArr.size()-1);
        }
    }
    public static int isEmpty(){
        if(numArr.size()==0){
            return 1;
        }else
            return 0;
    }
    
}