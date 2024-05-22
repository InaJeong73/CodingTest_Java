import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int S=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        int[]youngs=new int[N];
        for(int i=0;i<N;i++){
            youngs[i]=Integer.parseInt(st.nextToken());
        }
        int distance=0;
        int[]distanceSet=new int[N];
        for(int i=0;i<N;i++){
            if(S<youngs[i]){
                distance=youngs[i]-S;
            }else{
                 distance=S-youngs[i];
            }
            distanceSet[i]=distance;
        }
        int gcd=0;
        if(N==1) {
        	gcd=distanceSet[0];
        }
        else {
        	int a=0;
            int b=0;
            gcd=GCD(distanceSet[0],distanceSet[1]);
            for(int i=2;i<N;i++){
                    a=gcd;
                    b=distanceSet[i];
                    gcd=GCD(a,b);
                }
        }
        
        bw.write(Integer.toString(gcd));
        bw.flush();
        bw.close();
        }
    
    public static int GCD(int a, int b){
        if(b==0){
            return a;
        }else{
            return GCD(b,a%b);
        }
    }
}