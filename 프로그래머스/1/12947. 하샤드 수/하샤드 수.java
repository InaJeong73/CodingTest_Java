class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String str=String.valueOf(x);
        int sum=0;
        for(int i=0;i<str.length();i++){
            int k=Integer.parseInt(String.valueOf(str.charAt(i)));
            sum+=k;
        }
        if(x%sum==0)return true;
        else return false;
    }
}