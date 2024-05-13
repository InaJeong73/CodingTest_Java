import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Stack;
public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num=Integer.parseInt(br.readLine());
        Stack <Integer> ngeIndexstack=new Stack<Integer>();
        int[]intArr=new int[num];
        int[]ngeArr=new int[num];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<intArr.length;i++){
            intArr[i]=Integer.parseInt(st.nextToken());
        }
        ngeIndexstack.push(0);
        for(int i=1;i<intArr.length;i++){
            while(!ngeIndexstack.isEmpty()&&intArr[ngeIndexstack.peek()]<intArr[i]){
                ngeArr[ngeIndexstack.peek()]=intArr[i];
                ngeIndexstack.pop();
            }
            ngeIndexstack.push(i);
        }
        while(!ngeIndexstack.isEmpty()){
            ngeArr[ngeIndexstack.peek()]=-1;
            ngeIndexstack.pop();
        }
        for(int i=0;i<ngeArr.length;i++){
            if(i==ngeArr.length-1){
            	bw.write(Integer.toString(ngeArr[i]));
            }else{
            	bw.write(Integer.toString(ngeArr[i]) + " ");
            }
    }
        bw.flush();
        bw.close();
       
}
}