import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main{
    public static ArrayList<Integer>numArr;
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int num=Integer.parseInt(br.readLine());
        numArr=new ArrayList<Integer>();
        for(int i=0;i<num;i++){
           StringTokenizer st=new StringTokenizer(br.readLine());
            String str=st.nextToken();
            if(str.equals("push")){
               int pushNum=Integer.parseInt(st.nextToken());
                push(pushNum);
            }else if(str.equals("pop")){
                bw.write(String.valueOf(pop()));
                if(i<num-1){
                bw.write("\n");
                }
            }else if(str.equals("size")){
                bw.write(String.valueOf(numArr.size()));
                if(i<num-1){
                bw.write("\n");
                }
            }else if(str.equals("empty")){
                bw.write(String.valueOf(empty()));
                if(i<num-1){
                bw.write("\n");
                }
            }else if(str.equals("front")){
                bw.write(String.valueOf(front()));
                if(i<num-1){
                bw.write("\n");
                }
            }else if(str.equals("back")){
                bw.write(String.valueOf(back()));
                if(i<num-1){
                bw.write("\n");
                }
            }else{
                continue;
            }
        }
        bw.flush();
        bw.close();
    }
    public static void push(int num){
        numArr.add(num);
    }
     public static int pop(){
         if(numArr.isEmpty()){
             return -1;
         }else return numArr.remove(0);
    }
    public static int empty(){
        if(numArr.isEmpty()){
             return 1;
         }else return 0;
    }
     public static int front(){
        if(numArr.isEmpty()){
             return -1;
         }else return numArr.get(0);
    }
    public static int back(){
        if(numArr.isEmpty()){
             return -1;
         }else return numArr.get(numArr.size()-1);
    }
}