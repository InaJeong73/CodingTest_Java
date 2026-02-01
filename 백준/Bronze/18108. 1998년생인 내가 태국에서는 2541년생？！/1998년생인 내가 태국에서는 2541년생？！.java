import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int beYear=Integer.parseInt(br.readLine());
        int adYear=beYear-543;
        System.out.println(adYear);
    }
}