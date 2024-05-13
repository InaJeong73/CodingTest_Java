import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int num=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        Stack<Integer>s=new Stack<Integer>();
        int[]numArr=new int[num];
        int[]fArr=new int[1000001];
        int[]ngfArr=new int[num];
        for(int i=0;i<num;i++){
            numArr[i]=Integer.parseInt(st.nextToken());
            fArr[numArr[i]]++;
        }
        s.push(0);
        for(int i=1;i<num;i++){
         while(!s.isEmpty()&&fArr[numArr[s.peek()]]<fArr[numArr[i]]){
            ngfArr[s.peek()]= numArr[i];
            s.pop();
         }
          s.push(i);
        }
        while(!s.isEmpty()){
            ngfArr[s.peek()]=-1;
            s.pop();
        }
        for(int i=0;i<num;i++){
            if(i==num-1){
                bw.write(Integer.toString(ngfArr[i]));
            }else{
                 bw.write(Integer.toString(ngfArr[i])+" ");
            }
        }
        bw.flush();
        bw.close();
    }
}