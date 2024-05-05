import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.ArrayDeque;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Queue <Integer>queue=new ArrayDeque<Integer>();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        for(int i=0;i<n;i++) {
        	queue.offer(i+1);
        }
        
        int num;
        System.out.print("<");
        while(!queue.isEmpty()){
            num=0;
            for(int i=0;i<k;i++){
             num=queue.poll();
            if(i<k-1){
                queue.offer(num);
            }else if(i==k-1) {
            	 if(queue.isEmpty()){
                     System.out.print(num+">");
                 }else {
                 System.out.print(num+", ");
             }	
            }
            }
        }
    }
}