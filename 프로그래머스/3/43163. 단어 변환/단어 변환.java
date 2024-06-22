class Solution {
    public static boolean[]check;
    public static String[]words;
    public static String target;
    public static int minCount;
    public int solution(String begin, String target, String[] words) {
        this.words=words;
        this.target=target;
        check=new boolean[words.length];
        boolean exist=false;
        for(String str:words){
            if(target.equals(str)){
                exist=true;
                break;
            }
        }
        if(!exist) return 0;
        minCount=words.length;
        go(0,begin);
        return minCount;
    }
    public static void go(int count,String currentStr){
        if(currentStr.equals(target)){
            if(count<minCount)minCount=count;
            return;
        }
    for(int i=0;i<words.length;i++){
        if(check[i])continue;
        String tempStr=words[i];
        int c=0;
        for(int j=0;j<currentStr.length();j++){
            if(currentStr.charAt(j)!=tempStr.charAt(j)){
                c++;
            }
        }
        if(c==1){
            check[i]=true;
            go(count+1,tempStr);
            check[i]=false;
        }
    }
    }
}