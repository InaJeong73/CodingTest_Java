class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int zeroCount=0;
        int count=0;
        StringBuilder sb=new StringBuilder();
        String str=s;
        while(!str.equals("1")){
            count++;
            for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='0'){
                zeroCount++;
            }else{
                sb.append(c);
            }
        }
        int length=sb.length();
        str=Integer.toBinaryString(length);
        sb.setLength(0);
        }
       answer[0]=count;
       answer[1]=zeroCount;
        return answer;
    }
}