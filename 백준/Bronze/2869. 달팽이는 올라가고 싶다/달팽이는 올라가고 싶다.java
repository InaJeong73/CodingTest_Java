import java.util.Scanner;
public class Main{
    public static void main(String[]args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int V=sc.nextInt();
        int day=(int)Math.ceil((double)(V-A)/(A-B))+1;
        System.out.print(day);
    }
}