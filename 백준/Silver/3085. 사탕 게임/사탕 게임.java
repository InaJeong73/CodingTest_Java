import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	public static int num;
	public static char candies[][];
	public static int candiesNum[][];
	public final static int n=1000000000;
    public static void main(String[]args)throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        num=Integer.parseInt(br.readLine());
        candies=new char[num][num];
        candiesNum=new int[num][num];
        for(int i=0;i<num;i++) {
        	String candyStr=br.readLine();
        	for(int j=0;j<num;j++) {
        		candies[i][j]=candyStr.charAt(j);
        	}
        }
        int max=0;
        //오른쪽 요소와 비교
        //i는 행, j는 열이라고 했을 때 j의 범위를 한정해주면 된다. 
        for(int i=0;i<num;i++) {
        	for(int j=0;j<num-1;j++) {
        		char temp=candies[i][j];
        		candies[i][j]=candies[i][j+1];
        		candies[i][j+1]=temp;
	        	if(max<calcCandyNum()) {
	        		max=calcCandyNum();
	        	}
	        	temp=candies[i][j];
	        	candies[i][j]=candies[i][j+1];
	        	candies[i][j+1]=temp;
        	}
        }
        //아래요소와 비교
        for(int i=0;i<num;i++) {
        	for(int j=0;j<num-1;j++) {
        		char temp=candies[j][i];
        		candies[j][i]=candies[j+1][i];
        		candies[j+1][i]=temp;
	        	if(max<calcCandyNum()) {
	        		max=calcCandyNum();
	        	}
	        	temp=candies[j][i];
        		candies[j][i]=candies[j+1][i];
        		candies[j+1][i]=temp;
        	}
        }
        bw.write(Integer.toString(max));
        bw.flush();
        bw.close();
}
  public static void initCandiesNum() {
	  for(int i=0;i<num;i++) {
      	for(int j=0;j<num;j++) {
      		candiesNum[i][j]=1;
      	}
      }
  }
    
  public static int calcCandyNum() {
	  //한 행 내에서 비교하는 작업을 모든 행에 대해서 진행
	  initCandiesNum();
	  for(int i=0;i<num;i++) {
      	for(int j=0;j<num;j++) {
      		if(j==0)continue;
      		if(candies[i][j]==candies[i][j-1]) {
      			candiesNum[i][j]=candiesNum[i][j-1]+1;
      		}
      	}
      }
	  int maxInRow=calcCandyMaxNum();
	  initCandiesNum();
	  for(int j=0;j<num;j++) {
      	for(int i=0;i<num;i++) {
      		if(i==0)continue;
      		if(candies[i][j]==candies[i-1][j]) {
      			candiesNum[i][j]=candiesNum[i-1][j]+1;
      		}
      	}
      }
	  int maxInCol=calcCandyMaxNum();
	  int maxResult=Math.max(maxInRow, maxInCol);
	  return maxResult;
  }
  
  public static int calcCandyMaxNum(){
	  int max=0;
	  for(int i=0;i<num;i++) {
	      	for(int j=0;j<num;j++) {
	      		if(candiesNum[i][j]>max) {
	      			max=candiesNum[i][j];
	      		}
	      	}
	      }
	  return max;
  }
}

