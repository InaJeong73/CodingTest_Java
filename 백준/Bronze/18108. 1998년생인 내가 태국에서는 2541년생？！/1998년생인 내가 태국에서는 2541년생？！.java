import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
public static void main(String[]args)throws Exception{
BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
int year=Integer.parseInt(bf.readLine());
System.out.println(year-543);
}
}