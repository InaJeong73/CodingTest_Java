import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main{
    public static int[]numArr;
    public final static int MAX_N=10001;
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int num=Integer.parseInt(br.readLine());
        numArr=new int[num];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<num;i++){
            numArr[i]=Integer.parseInt(st.nextToken());
        }
        Stack<Integer>stack=new Stack<Integer>();
        boolean isLast=true;
        for(int i=num-1;i>=0;i--) {
        	if(i==num-1){
                continue;
            }
        	 if(numArr[i]<numArr[i+1]) {
        		 int min=MAX_N;
                 int minj=0;
                 isLast=false;
                    for(int j=i+1;j<num;j++){
                        if(numArr[i]<numArr[j]&&numArr[j]<min){
                            min=numArr[j];
                            minj=j;
                        }
                    }
                    int temp=numArr[i];
                    numArr[i]=min;
                    numArr[minj]=temp;
                    
                    for(int j=i+1;j<num;j++){
                         stack.push(numArr[j]);
                    }
                    int k=i+1;
                    while(!stack.isEmpty()){
                        numArr[k]=stack.pop();
                        k++;
                    }
                    break;
                    }
        	 }
        
       if(isLast) {
    	   bw.write(Integer.toString(-1));
       }else {
        for(int i=0;i<num;i++){
            bw.write(Integer.toString(numArr[i]));
            if(i<num-1)bw.write(" ");
        }
       }
       bw.flush();
       bw.close();
    }
}