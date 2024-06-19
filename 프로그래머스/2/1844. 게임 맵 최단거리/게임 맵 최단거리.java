import java.util.*;
class Solution {
    public static Queue<int[]>q;
    public static boolean[][]c;
    public int solution(int[][] maps) {
        q=new LinkedList<>();
        c=new boolean[maps.length][maps[0].length];
        c[0][0]=true;
        q.add(new int[]{0,0,1});
        while(!q.isEmpty()){
            int[]temp=q.poll();
            //동으로 이동시: i,j+1
            //서로 이동시: i,j-1
            //남으로 이동시: i-1,j
            //북으로 이동시: i+1,j
            int[]rl={0,0,-1,1};
            int[]ud={1,-1,0,0};
            int i=temp[0];
            int j=temp[1];
            int d=temp[2];
            if(i==maps.length-1&&j==maps[0].length-1) return d;
            for(int k=0;k<4;k++){
                int ni=i+rl[k];
                int nj=j+ud[k];
                if(ni>=0&&ni<maps.length&&nj>=0&&nj<maps[0].length&&maps[ni][nj]==1&&!c[ni][nj]){
                    c[ni][nj]=true;
                    q.add(new int[]{ni,nj,d+1});
                }
            }
        }
        return -1;
    }
    }
