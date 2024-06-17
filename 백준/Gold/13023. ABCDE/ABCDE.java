import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        boolean[][] a=new boolean[n][n];
        ArrayList<Integer>[]g=(ArrayList<Integer>[])new ArrayList[n];
        //n과 연결된 모든 정점을 담은 배열리스트 
        ArrayList<Edge>edges=new ArrayList<Edge>();
        for(int i=0;i<n;i++){
            g[i]=new ArrayList<Integer>();
        }
        for(int i=0;i<m;i++){
             st=new StringTokenizer(br.readLine());
            int to=Integer.parseInt(st.nextToken());
            int from=Integer.parseInt(st.nextToken());
            edges.add(new Edge(to,from));
            edges.add(new Edge(from,to));
            g[to].add(from);
            g[from].add(to);
            a[to][from]=a[from][to]=true;
        }
        m*=2;
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                int A=edges.get(i).to;
                int B=edges.get(i).from;
                int C=edges.get(j).to;
                int D=edges.get(j).from;
                if(A==B||A==C||A==D||B==C||B==D||C==D)continue;
                if(!a[B][C])continue;
                for(int E:g[D]){
                    if(E==A||E==B||E==C||E==D)continue;
                    bw.write("1");
                    bw.flush();
                    bw.close();
                    System.exit(0);
                }
            }
        }
        bw.write("0");
        bw.flush();
        bw.close();
    }
}
class Edge{
    int to;
    int from;
    Edge(int from,int to){
        this.from=from;
         this.to=to;
    }
}