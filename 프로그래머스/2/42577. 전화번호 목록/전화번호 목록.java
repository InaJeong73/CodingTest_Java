import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for(int i=0;i<phone_book.length-1;i++){
            String str1=phone_book[i];
            String str2=phone_book[i+1];
            int l=str1.length();
            if(l>str2.length())continue;
            if(str2.substring(0,l).equals(str1))return false;
        }
        return answer;
    }
}