class Solution {
    boolean solution(String s) {
        boolean answer = true;
        //p와 y의 개수가 같으면 'true',다르면 'false',p와 y 모두 하나도 없는 경우 'true'
        int pCount=0;
        int yCount=0;
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)=='p'||s.charAt(i)=='P'){
                pCount++;
            }
             if(s.charAt(i)=='y'||s.charAt(i)=='Y'){
                yCount++;
            }
        }
        if(pCount==yCount){
            //if(pCount==0&&yCount==0)return true;
            return true;
        }
        else return false;
    }
}