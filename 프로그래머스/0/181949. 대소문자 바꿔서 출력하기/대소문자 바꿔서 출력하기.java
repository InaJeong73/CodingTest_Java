import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[]arr=a.toCharArray();
        for(int i=0;i<arr.length;i++){
            char c=arr[i];
        if(Character.isUpperCase(c)==true){
            c=Character.toLowerCase(c);
        }else{
            c=Character.toUpperCase(c);
        }
            System.out.print(c);
            }
    }
}