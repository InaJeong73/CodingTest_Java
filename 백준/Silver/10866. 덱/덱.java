import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main{
    public static ArrayList<Integer>numArr=new ArrayList<Integer>();
    static int goalNum=0;
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        for(int i=0;i<num;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            String str=st.nextToken();
            int pushNum;
            boolean isPush=false;
            switch(str){
                case "push_front":
                    pushNum=Integer.parseInt(st.nextToken());
                    push_front(pushNum); 
                    isPush=true;
                    break;
                case "push_back":
                    pushNum=Integer.parseInt(st.nextToken());
                    push_back(pushNum); 
                    isPush=true;
                    break;
                case "pop_front":
                	goalNum=pop_front(); 
                    break;    
                case "pop_back":
                	goalNum=pop_back(); 
                    break;    
                case "size":
                	goalNum=numArr.size(); 
                    break;
                case "empty":
                	goalNum=empty();
                    break;
                case "front":
                	goalNum=front();
                    break;    
                case "back":
                	goalNum=back();
                    break;    
                    
            }
            if(isPush==true) {
            	continue;
            }
            if(num==i-1){
                System.out.print(goalNum);
            }else{
               System.out.println(goalNum); 
            }
        }
    }
    public static void push_front(int num){
    	numArr.add(0,num);
    }
    public static void push_back(int num){
    	numArr.add(num);
    }
    public static int pop_front(){
        if(numArr.isEmpty()){
            return -1;
        }else{
        return numArr.remove(0);
        }
    }
    public static int pop_back(){
        if(numArr.isEmpty()){
            return -1;
        }else{
        return numArr.remove(numArr.size()-1);
        }
    }
    public static int front(){
    	if(numArr.isEmpty()){
            return -1;
        }
    	return numArr.get(0);
    }
    public static int back(){
    	if(numArr.isEmpty()){
            return -1;
        }
    	return numArr.get(numArr.size()-1);
    }
    public static int empty(){
        if(numArr.isEmpty()){
            return 1;
        }else{
            return 0;
        }
    }
}