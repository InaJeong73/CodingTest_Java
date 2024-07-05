class Solution {
    public int solution(int n) {
        int answer = 0;
        int oneCount=0;
        
        boolean findNextNum=false;
        String nStr=Integer.toBinaryString(n);
        for(int i=0;i<nStr.length();i++){
            if(nStr.charAt(i)=='1')oneCount++;
        }
        while(!findNextNum){
        int tempCount=0;
        n++;
        String nextNStr=Integer.toBinaryString(n);
        for(int i=0;i<nextNStr.length();i++){
            if(nextNStr.charAt(i)=='1')tempCount++;
        }
        if(tempCount==oneCount)findNextNum=true;
        }
        answer=n;
        return answer;
    }
}