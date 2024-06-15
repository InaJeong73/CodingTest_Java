class Solution {
    public static int[][]dungeonsArr;
    public static boolean[]check;
    public static int maxCount=0;
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        dungeonsArr=dungeons;
        check=new boolean[dungeons.length];
        go(k,0);  
        answer=maxCount;
        return answer;
    }
    public static void go(int current,int count){
        if( maxCount<count){
            maxCount=count;
        }
        for(int i=0;i<dungeonsArr.length;i++){
        	if(check[i])continue;
            if(current>=dungeonsArr[i][0]){
                check[i]=true;
                go(current-dungeonsArr[i][1],count+1);
            check[i]=false;
            }
    }
}
}