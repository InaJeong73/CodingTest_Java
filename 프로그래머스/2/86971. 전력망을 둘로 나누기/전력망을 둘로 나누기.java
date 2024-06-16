class Solution {
    public static int[][]wiresArr;
    public static int[][]startNumCount;
    public static int min_DifferenceCount=Integer.MAX_VALUE;
    public static boolean []visited;
    public static int count=0;
    //startNumCount[i][0]=wires[i][0]으로 시작하는 집합의 총 노드 개수
    //startNumCount[i][1]=wires[i][1]으로 시작하는 집합의 총 노드 개수
    public static int solution(int n, int[][] wires) {
        wiresArr=wires;
       
        for(int i=0;i<n-1;i++){
            int startNode1=wiresArr[i][0];
            int startNode2=wiresArr[i][1];
            
            count=1;
            visited=new boolean[n-1];
            visited[i]=true;
            go(startNode1);
            int count1=count;
            
            count=1;
            visited=new boolean[n-1];
            visited[i]=true;
            go(startNode2);
            int count2=count;
            
            int diffenrenceCount=0;
            if(count1>count2){
                diffenrenceCount=count1-count2;
            }else{
                diffenrenceCount=count2-count1;
            }
            //wiresArr의 i번째 노선을 끊겠다는 의미
            if(diffenrenceCount<min_DifferenceCount){
                min_DifferenceCount=diffenrenceCount;
            }
        }
        int answer=min_DifferenceCount;
        return answer;
    }
    public static void go(int startNode){
        for(int i=0;i<wiresArr.length;i++){
            if(visited[i])continue;
            if(wiresArr[i][0]==startNode) {count++; visited[i]=true; go(wiresArr[i][1]);}
            if(wiresArr[i][1]==startNode){count++; visited[i]=true; go(wiresArr[i][0]);}
        }
        return;
    }
}