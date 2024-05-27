import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	public static int D[][];
	public final static int n=1000000000;
    public static void main(String[]args)throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int[]children=new int[9];
        int sum=0;
        for(int i=0;i<9;i++) {
        	children[i]=Integer.parseInt(br.readLine());
        	sum+=children[i];
        }
        Arrays.sort(children);
        int child1=0;
        int child2=0;
        boolean find=false;
        for(int i=0;i<9;i++) {
        	for(int j=i+1;j<9;j++) {
        		if(sum-children[i]-children[j]==100) {
        			child1=i;
        			child2=j;
        			find=true;
        		}
        	}
        	if(find==true) {
        		break;
        	}
        }
        for(int i=0;i<9;i++) {
        	if(i==child1||i==child2) continue;
        	else {
        		bw.write(Integer.toString(children[i]));
        		if(i<8) {
        			bw.write("\n");
        		}
        	}
        }
        
        bw.flush();
        bw.close();
}
   
}

