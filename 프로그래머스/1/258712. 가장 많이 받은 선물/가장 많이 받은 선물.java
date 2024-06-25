import java.util.*;
class Friend{
    int index;
    int name;
    Friend(int index,int name){
        this.index=index;
        this.name=name;
    }
}

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        HashMap<String,Integer>friendMap=new HashMap<>();
        int[][]giveAndTake=new int[friends.length][friends.length];
        int[][]giftRecord=new int[friends.length][3];//0: 준선물개수,1: 받은선물개수,2: 선물 지수
        for(int i=0;i<friends.length;i++){
           friendMap.put(friends[i],i);
        }
        for(int[]row:giveAndTake){
            Arrays.fill(row,0);
        }
        for(int i=0;i<gifts.length;i++){
            StringTokenizer st=new StringTokenizer(gifts[i]);
            giveAndTake[friendMap.get(st.nextToken())][friendMap.get(st.nextToken())]++;
        }
        for(int i=0;i<giftRecord.length;i++){
            for(int j=0;j<giveAndTake[0].length;j++){
                 giftRecord[i][0]+=giveAndTake[i][j];
            }
            for(int j=0;j<giveAndTake.length;j++){
                 giftRecord[i][1]+=giveAndTake[j][i];
            }
            giftRecord[i][2]=giftRecord[i][0]- giftRecord[i][1];
        }
        int[]countArr=new int [giveAndTake.length];
        Arrays.fill(countArr,0);
        for(int i=0;i<giveAndTake.length;i++){
            for(int j=0;j<giveAndTake[0].length;j++){
                if(i==j)continue;
                if(giveAndTake[i][j]>giveAndTake[j][i])countArr[i]++;
                else if(giveAndTake[i][j]==giveAndTake[j][i]){
                     if(giftRecord[i][2]>giftRecord[j][2])countArr[i]++;
                }
            }
        }
        int max=0;
        for(int n:countArr){
            if(n>max)max=n;
        }
        answer=max;
        return answer;
    }
}