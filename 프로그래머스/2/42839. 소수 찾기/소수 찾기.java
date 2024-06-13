import java.util.ArrayList;

class Solution {
public static char []cArr;
public static boolean[]check;//새로운 숫자를 만들면서 cArr[i]를 사용한적있는지
public static char[]number;//새롭게 만들고자 하는 숫자배열
public static ArrayList<Integer>intNum=new ArrayList<Integer>();
    public int solution(String numbers) {
        int answer = 0;
        int count=0;
        cArr=new char[numbers.length()];//흩어진 char형 숫자들을 담는 배열
        for(int i=0;i<numbers.length();i++){
            cArr[i]=numbers.charAt(i);
        }
       
//길이가 1부터 numbers.length()인 모든 구성의 숫자들을 만들어보기
        for(int i=1;i<=numbers.length();i++){
           number=new char[i];
            check=new boolean[numbers.length()];
            go(0,i);
        }
        for(int i=0;i<intNum.size();i++){
            if(isPrime(intNum.get(i)))count++;
        }
        answer=count;
        return answer;
    }
    public boolean isPrime(int num){
        if(num<2) return false;
      for(int i=2;i*i<=num;i++) {
          if(num%i==0)return false;
      }
        return true;
    }
    public void go(int index, int length){
        if(index==length) {
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<length;i++){
                sb.append(number[i]);
            }
            int num=Integer.parseInt(sb.toString());
            if(!intNum.contains(num))intNum.add(num);
            return;
        }
        for(int i=0;i<cArr.length;i++){
            if(!check[i]){
                if(index==0&&cArr[i]==0)continue;
                number[index]=cArr[i];
                check[i]=true;
                go(index+1,length);
                check[i]=false;
            }
        }
    }
}