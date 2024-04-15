import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(bf.readLine());
        int[]numArr=new int[3];
        for(int i=0;i<numArr.length;i++){
        numArr[i]=Integer.parseInt(st.nextToken());  
        }
        int count=0;
        int max=0;
        int fixNum=0;
        int reward=0;
        for(int i=0;i<numArr.length;i++){
            int num=numArr[i];
            for(int j=i+1;j<numArr.length;j++){
                if(num==numArr[j]){
                    count++;
                    fixNum=num;
                }
            }
             if(count==2)break;
        }
        if(count==0){
            for(int i=0;i<numArr.length;i++){
                if(max<numArr[i]){
                    max=numArr[i];
                }
            }
           reward=max*100; 
            System.out.println(reward);
        }
        if(count==1){
            reward=1000+fixNum*100; 
            System.out.println(reward);
        }
        if(count==2){
            reward=10000+fixNum*1000; 
            System.out.println(reward);
        }
}
}