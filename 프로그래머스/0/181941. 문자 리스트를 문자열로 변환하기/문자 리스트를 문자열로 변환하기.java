class Solution {
    public String solution(String[] arr) {
        String answer = "";
        for(String s:arr){
           answer= answer.concat(s);
        }
        return answer;
    }
}