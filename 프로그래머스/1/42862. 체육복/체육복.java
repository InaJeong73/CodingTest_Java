class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[]std=new int[n];
        for(int i=0;i<n;i++){
            std[i]=0;
        }
        for(int i=0;i<lost.length;i++){
            std[lost[i]-1]-=1;
        }
        for(int i=0;i<reserve.length;i++){
            std[reserve[i]-1]+=1;
        }
        for(int i=0;i<std.length;i++){
            if(std[i]!=-1)continue;
            if(i==0){
                    if(std[i+1]==1){
                        std[i]=0;
                        std[i+1]=0;
                    }
                }else if(i==std.length-1){
                    if(std[i-1]==1){
                        std[i]=0;
                        std[i-1]=0;
                        continue;
                    }
                }else{
                    if(std[i-1]==1){
                        std[i]=0;
                        std[i-1]=0;
                        continue;
                    }
                    if(std[i+1]==1){
                        std[i]=0;
                        std[i+1]=0;
                    }
                }
            
        }
        int count=0;
        for(int i=0;i<std.length;i++){
            if(std[i]!=-1){
                count++;
            }
        }
        return count;
    }
}