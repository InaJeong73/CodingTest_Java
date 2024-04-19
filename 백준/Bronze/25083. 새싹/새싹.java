public class Main{
    public static void main(String[]args){
    String text="         ,r\'\"7\nr`-_   ,\'  ,/\n \\. \". L_r\'\n   `~\\/\n      |\n      |";
    String[]strList=text.split("\n");
        for(int i=0;i<strList.length;i++){
           if(i<strList.length-1){
               System.out.println(strList[i]); 
           }else{
               System.out.print(strList[i]);
           }
        }
    }
}