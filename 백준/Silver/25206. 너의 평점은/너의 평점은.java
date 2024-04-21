import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String line;
        String subject;
        double credit=0;
        String score;
        double score_sum=0;
        double credit_sum=0;
        double major_score=0;
        
        while((line=br.readLine())!=null){
           double i_score=0;
           StringTokenizer st=new StringTokenizer(line);
           subject=st.nextToken();
           credit=Double.parseDouble(st.nextToken());
           score=st.nextToken();
           if(score.equals("A+"))i_score=4.5;
            else if(score.equals("A0"))i_score=4.0;
            else if(score.equals("B+"))i_score=3.5;
            else if(score.equals("B0"))i_score=3.0;
            else if(score.equals("C+"))i_score=2.5;
            else if(score.equals("C0"))i_score=2.0;
            else if(score.equals("D+"))i_score=1.5;
            else if(score.equals("D0"))i_score=1.0;
            else if(score.equals("F"))i_score=0.0;
            else if(score.equals("P"))continue;
            else continue;
          
            score_sum+=i_score*credit;
            credit_sum+=credit;
        } 
        if (credit_sum != 0) {
            major_score = score_sum / credit_sum;
            System.out.printf("%.6f", major_score);
        }
    }
}