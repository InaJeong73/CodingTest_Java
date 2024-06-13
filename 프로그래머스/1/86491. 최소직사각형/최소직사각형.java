class Solution {
    public int solution(int[][] sizes) {
        int maxLength=0;
        int maxWidth=0;
       for(int i=0;i<sizes.length;i++){
           if(sizes[i][0]<sizes[i][1]){
               int temp=sizes[i][0];
               sizes[i][0]=sizes[i][1];
               sizes[i][1]=temp;
           }
       }
        for(int i=0;i<sizes.length;i++){
           if(sizes[i][0]>maxLength){
               maxLength=sizes[i][0];
           }
       }
        for(int i=0;i<sizes.length;i++){
           if(sizes[i][1]>maxWidth){
               maxWidth=sizes[i][1];
           }
       }
        int answer=maxLength*maxWidth;
        return answer;
    }
}
