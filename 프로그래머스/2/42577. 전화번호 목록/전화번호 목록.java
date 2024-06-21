import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for(int i=0;i<phone_book.length-1;i++){
            if(phone_book[i+1].startsWith(phone_book[i])){
                return false;
            }
        }
        
        
        
        
        //i번째 string의 길이가 j번째 string 보다 작거나 같으면 j번째 substring을 i번째 string과 비교.
        //i번째 string의 길이가 j번째 string 보다 크면 i번째 substring을  j번째 string과 비교.
        // for(int i=0;i<phone_book.length;i++){
        //      int strILength=phone_book[i].length();
        //     for(int j=i+1;j<phone_book.length;j++){
        //         int strJLength=phone_book[j].length();
        //         if(strILength<=strJLength){
        //             if(phone_book[i].equals(phone_book[j].substring(0,strILength))){
        //             answer=false;
        //             break;
        //         }
        //         }else{
        //            if(phone_book[j].equals(phone_book[i].substring(0,strJLength))){
        //             answer=false;
        //             break;
        //         } 
        //         }
        //     }
        // }
        return answer;
    }
}