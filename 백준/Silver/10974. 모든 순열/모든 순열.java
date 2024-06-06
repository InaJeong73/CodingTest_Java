import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
public class Main{
    public static int[]numArr;
    public final static int MAX_N=10001;
    public static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    public static ArrayList<String>strArr=new ArrayList<String>();
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        numArr=new int[num];
        for(int i=0;i<num;i++){
            numArr[i]=i+1;
        }
        for(int k=0;k<numArr.length;k++){
            bw.write(Integer.toString(numArr[k]));
            if(k<numArr.length-1)bw.write(" ");
        }
       bw.write("\n");
       go(numArr);
      
       bw.flush();
       bw.close();
    }
    public static void go(int[]arr)throws Exception{
    	for(int i=arr.length-1;i>=0;i--) {
        	if(i==arr.length-1){
                continue;
            }
        	 if(numArr[i]<numArr[i+1]) {
                 int minIdx=i+1;
                    for(int j=i+1;j<arr.length;j++){
                        if(numArr[i]<numArr[j]&&numArr[j]<numArr[minIdx]){
                        	minIdx=j;
                        }
                    }
                    int temp=numArr[i];
                    numArr[i]=numArr[minIdx];
                    numArr[minIdx]=temp;
                    reverse(numArr,i+1,arr.length-1);
                    for(int k=0;k<arr.length;k++){
                        bw.write(Integer.toString(numArr[k]));
                        if(k<arr.length-1)bw.write(" ");
                    }
                	bw.write("\n");
                	go(arr);
                	return;
                    }
        	 if(i==0) {
        		 return;
        	 }
        	 }
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