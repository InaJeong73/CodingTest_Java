import java.util.*;

public class Solution {
    public int solution(int n) {
        String str=String.valueOf(n);
        int sum=0;
        for(int i=0;i<str.length();i++){
           int num= Integer.parseInt(String.valueOf(str.charAt(i)));
            sum+=num;
        }      
        return sum;
    }
}