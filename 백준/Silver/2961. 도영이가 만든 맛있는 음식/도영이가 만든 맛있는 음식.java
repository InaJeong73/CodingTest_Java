import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int min=Integer.MAX_VALUE;
    static Food[]foods;
    static boolean[]select;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N=Integer.parseInt(br.readLine());
        foods=new Food[N];
        StringTokenizer st;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            foods[i]=new Food(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        select=new boolean[N];
        go(0);
        System.out.print(min);
    }
    static void go(int idx){
        if(idx==N){
            int count=0;
            for(int i=0;i<N;i++){
                if(select[i])count++;
            }
            if(count==0){return;}
            int totalS=1;
            int totalB=0;
            for(int i=0;i<N;i++){
                if(select[i]){
                    totalS*=foods[i].getS();
                    totalB+=foods[i].getB();
                }
            }
            int diff=0;
            if(totalS>totalB){diff=totalS-totalB;}
            else{
                diff=totalB-totalS;
            }
            if(diff<min){min=diff;}
            return;
        }
        
            select[idx]=true;
            go(idx+1);
            select[idx]=false;
            go(idx+1);
        
    }
}
class Food{
    private int S;
    private int B;
    public Food(int S,int B){
        this.S=S;
        this.B=B;
    }
    public int getS() {
        return S;
    }

    public void setS(int s) {
        S = s;
    }

    public int getB() {
        return B;
    }

    public void setB(int b) {
        B = b;
    }
}
