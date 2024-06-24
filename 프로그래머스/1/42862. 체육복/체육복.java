import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[]std=new int[n+1];
        Arrays.fill(std,1);
        //모든 학생의 체육복을 다 1개로 초기화
        for(int l:lost){
         std[l]--;   
        }
        for(int r:reserve){
         std[r]++;   
        }
        
        for(int i=1;i<std.length;i++){
            if(std[i]==0){
            if(i-1>0&&std[i-1]==2){
                std[i]++;
                std[i-1]--;
            }else if(i+1<std.length&&std[i+1]==2){
                std[i]++;
                std[i+1]--;
            }
            }
        }
        int count=0;
        for(int i=1;i<std.length;i++){
            if(std[i]!=0)count++;
        }
        return count;
    }
}


// for(int i=0;i<n;i++){
//             std[i]=0;
//         }
//         for(int i=0;i<lost.length;i++){
//             std[lost[i]-1]-=1;
//         }
//         for(int i=0;i<reserve.length;i++){
//             std[reserve[i]-1]+=1;
//         }
//         for(int i=0;i<std.length;i++){
//             if(std[i]!=-1)continue;
//             if(i==0){
//                     if(std[i+1]==1){
//                         std[i]=0;
//                         std[i+1]=0;
//                     }
//                 }else if(i==std.length-1){
//                     if(std[i-1]==1){
//                         std[i]=0;
//                         std[i-1]=0;
//                         continue;
//                     }
//                 }else{
//                     if(std[i-1]==1){
//                         std[i]=0;
//                         std[i-1]=0;
//                         continue;
//                     }
//                     if(std[i+1]==1){
//                         std[i]=0;
//                         std[i+1]=0;
//                     }
//                 }
            
//         }
//         int count=0;
//         for(int i=0;i<std.length;i++){
//             if(std[i]!=-1){
//                 count++;
//             }
//         }