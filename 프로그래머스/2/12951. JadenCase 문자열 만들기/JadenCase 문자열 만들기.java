import java.util.*;
class Solution {
    public String solution(String s) {
        int i=0;
        boolean isFirstChar=true;
        StringBuilder sb=new StringBuilder();
        while(i<s.length()){
           char c=s.charAt(i);
            i++;
            if(c==' '){
                    sb.append(c);
                    isFirstChar=true;
                continue;
                }
            if(isFirstChar){
                if(Character.isLetter(c)){
                   sb.append(Character.toUpperCase(c));
                }else{
                    sb.append(c);
                }
                isFirstChar=false;
                continue;
            }else
                sb.append(Character.toLowerCase(c));
                
                    
            }
        return sb.toString();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    // String[]strArr=s.split(" ");
    // StringBuilder sb=new StringBuilder();
    // for(int i=0;i<strArr.length;i++){
    //     String str=strArr[i];
    //     for(int j=0;j<str.length();j++){
    //         char c=str.charAt(j);
    //         if(j==0){
    //             if(!Character.isLetter(c)){
    //                sb.append(c);
    //                 continue;
    //             }else{
    //                 if(!Character.isUpperCase(c)){
    //                     sb.append(Character.toUpperCase(c));
    //                     continue;
    //                 }
    //             }
    //         }else{
    //             if(!Character.isLowerCase(c)){
    //                     sb.append(Character.toLowerCase(c));
    //                     continue;
    //                 }
    //         }
    //         sb.append(c);
    //         }
    //     if(i<strArr.length-1){
    //         sb.append(" ");
    //     }
    // }
    //     return sb.toString();
        
    }
}
