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
        boolean isLast=true;
        for(int i=num-1;i>=0;i--) {
        	if(i==num-1){
                continue;
            }
        	 if(numArr[i]<numArr[i+1]) {
                 int minIdx=i+1;
                 isLast=false;
                    for(int j=i+1;j<num;j++){
                        if(numArr[i]<numArr[j]&&numArr[j]<numArr[minIdx]){
                            minIdx=j;
                        }
                    }
                    int temp=numArr[i];
                    numArr[i]=numArr[minIdx];
                    numArr[minIdx]=temp;
                    reverse(numArr,i+1,num-1);
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
    public static void reverse(int[]arr,int start,int end) {
    	while(start<end) {
    	int temp=arr[start];
    	arr[start]=arr[end];
    	arr[end]=temp;
    	start++;
    	end--;
    	}
    }
}