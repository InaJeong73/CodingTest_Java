import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
//천만까지의 모든 숫자에 대해서 목표 채널까지 가려면 버튼을 몇번 눌러야하는지 계산하고 구한 횟수들의 최솟값을 출력한다. 
public class Main{
	public static int[][]numArr;
	public static boolean[]broken=new boolean[10];
    public static void main(String[]args)throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        numArr=new int[N][M];
        for(int i=0;i<N;i++) {
        	st=new StringTokenizer(br.readLine());
        	for(int j=0;j<M;j++) {
        		numArr[i][j]=Integer.parseInt(st.nextToken());
        	}
        }
        int sum=0;
        //첫번째 모양(가로로 긴)
        for(int i=0;i<N;i++) {
        	for(int j=0;j<=M-4;j++) {
        		int subSum=numArr[i][j]+numArr[i][j+1]+numArr[i][j+2]+numArr[i][j+3];
        		if(subSum>sum)sum=subSum;
        	}
        }
        //첫번째 모양(세로로 긴)
        for(int i=0;i<=N-4;i++) {
        	for(int j=0;j<M;j++) {
        		int subSum=numArr[i][j]+numArr[i+1][j]+numArr[i+2][j]+numArr[i+3][j];
        		if(subSum>sum)sum=subSum;
        	}
        }
        //두번째 모양
        for(int i=0;i<=N-2;i++) {
        	for(int j=0;j<=M-2;j++) {
        		int subSum=numArr[i][j]+numArr[i][j+1]+numArr[i+1][j]+numArr[i+1][j+1];
        		if(subSum>sum)sum=subSum;
        	}
        }
        //세번째 모양(세로로 긴 오른쪽 아래)
        for(int i=0;i<=N-3;i++) {
        	for(int j=0;j<=M-2;j++) {
        		int subSum=numArr[i][j]+numArr[i+1][j]+numArr[i+2][j]+numArr[i+2][j+1];
        		if(subSum>sum)sum=subSum;
        	}
        }
      //세번째 모양(세로로 긴 오른쪽 위)
        for(int i=0;i<=N-3;i++) {
        	for(int j=0;j<=M-2;j++) {
        		int subSum=numArr[i][j]+numArr[i][j+1]+numArr[i+1][j]+numArr[i+2][j];
        		if(subSum>sum)sum=subSum;
        	}
        }
      //세번째 모양(세로로 긴 왼 아래)
        for(int i=2;i<N;i++) {
        	for(int j=0;j<=M-2;j++) {
        		int subSum=numArr[i][j]+numArr[i][j+1]+numArr[i-1][j+1]+numArr[i-2][j+1];
        		if(subSum>sum)sum=subSum;
        	}
        }
      //세번째 모양(세로로 긴 왼 위)
        for(int i=0;i<=N-3;i++) {
        	for(int j=0;j<=M-2;j++) {
        		int subSum=numArr[i][j]+numArr[i][j+1]+numArr[i+1][j+1]+numArr[i+2][j+1];
        		if(subSum>sum)sum=subSum;
        	}
        }
        //세번째 모양(가로로 긴 오른쪽 아래)
        for(int i=0;i<=N-2;i++) {
        	for(int j=0;j<=M-3;j++) {
        		int subSum=numArr[i][j]+numArr[i][j+1]+numArr[i][j+2]+numArr[i+1][j+2];
        		if(subSum>sum)sum=subSum;
        	}
        }
      //세번째 모양(가로로 긴 오른쪽 위)
        for(int i=1;i<N;i++) {
        	for(int j=0;j<=M-3;j++) {
        		int subSum=numArr[i][j]+numArr[i][j+1]+numArr[i][j+2]+numArr[i-1][j+2];
        		if(subSum>sum)sum=subSum;
        	}
        }
      //세번째 모양(가로로 긴 왼 아래)
        for(int i=0;i<=N-2;i++) {
        	for(int j=0;j<=M-3;j++) {
        		int subSum=numArr[i][j]+numArr[i+1][j]+numArr[i][j+1]+numArr[i][j+2];
        		if(subSum>sum)sum=subSum;
        	}
        }
      //세번째 모양(가로로 긴 왼 위)
        for(int i=0;i<=N-2;i++) {
        	for(int j=0;j<=M-3;j++) {
        		int subSum=numArr[i][j]+numArr[i+1][j]+numArr[i+1][j+1]+numArr[i+1][j+2];
        		if(subSum>sum)sum=subSum;
        	}
        }
        //네번쨰 모양1
        for(int i=0;i<=N-3;i++) {
        	for(int j=0;j<=M-2;j++) {
        		int subSum=numArr[i][j]+numArr[i+1][j]+numArr[i+1][j+1]+numArr[i+2][j+1];
        		if(subSum>sum)sum=subSum;
        	}
        }
      //네번쨰 모양2
        for(int i=0;i<=N-3;i++) {
        	for(int j=1;j<M;j++) {
        		int subSum=numArr[i][j]+numArr[i+1][j]+numArr[i+1][j-1]+numArr[i+2][j-1];
        		if(subSum>sum)sum=subSum;
        	}
        }
      //네번쨰 모양3
        for(int i=1;i<N;i++) {
        	for(int j=0;j<=M-3;j++) {
        		int subSum=numArr[i][j]+numArr[i][j+1]+numArr[i-1][j+1]+numArr[i-1][j+2];
        		if(subSum>sum)sum=subSum;
        	}
        }
      //네번쨰 모양4
        for(int i=0;i<=N-2;i++) {
        	for(int j=0;j<=M-3;j++) {
        		int subSum=numArr[i][j]+numArr[i][j+1]+numArr[i+1][j+1]+numArr[i+1][j+2];
        		if(subSum>sum)sum=subSum;
        	}
        }
      //다섯번째 모양(세로로 긴 오른쪽)
        for(int i=0;i<=N-3;i++) {
        	for(int j=0;j<=M-2;j++) {
        		int subSum=numArr[i][j]+numArr[i+1][j]+numArr[i+2][j]+numArr[i+1][j+1];
        		if(subSum>sum)sum=subSum;
        	}
        }
      //다섯번째 모양(세로로 긴 왼쪽)
        for(int i=1;i<=N-2;i++) {
        	for(int j=0;j<=M-2;j++) {
        		int subSum=numArr[i][j]+numArr[i][j+1]+numArr[i-1][j+1]+numArr[i+1][j+1];
        		if(subSum>sum)sum=subSum;
        	}
        }
        //다섯번째 모양(가로로 긴 아래)
        for(int i=0;i<=N-2;i++) {
        	for(int j=0;j<=M-3;j++) {
        		int subSum=numArr[i][j]+numArr[i][j+1]+numArr[i][j+2]+numArr[i+1][j+1];
        		if(subSum>sum)sum=subSum;
        	}
        }
      //다섯번째 모양(가로로 긴 위)
        for(int i=1;i<N;i++) {
        	for(int j=0;j<=M-3;j++) {
        		int subSum=numArr[i][j]+numArr[i][j+1]+numArr[i][j+2]+numArr[i-1][j+1];
        		if(subSum>sum)sum=subSum;
        	}
        }
        
        bw.write(Integer.toString(sum));
        bw.flush();
        bw.close();
}
    
}

