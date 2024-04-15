import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(bf.readLine());
        int clock=Integer.parseInt(st.nextToken());
        int minute=Integer.parseInt(st.nextToken());
        int time=Integer.parseInt(bf.readLine());
        int timeClock=time/60;
        int timeMinute=time%60;
        
        clock=clock+timeClock;
        
        if(minute+timeMinute<60){
            minute=minute+timeMinute;
            clock=clock%24;
            System.out.println(clock+" "+minute);
        }else{
            clock++;
            clock=clock%24;
            minute=minute+timeMinute-60;
            System.out.println(clock+" "+minute);
        }
    }
}