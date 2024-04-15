import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(bf.readLine());
        int time=Integer.parseInt(st.nextToken());
        int minute=Integer.parseInt(st.nextToken());
        
        if(minute>=45){
            minute=minute-45;
            System.out.println(time+" "+minute);
        }else{
            minute=60-(45-minute);
            if(time==0){
                time=23;
            }else{
                time=time-1;
            }
            System.out.println(time+" "+minute);
        }
        
    }
}