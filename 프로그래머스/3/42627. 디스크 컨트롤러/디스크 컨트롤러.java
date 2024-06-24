import java.util.*;
class Job implements Comparable<Job>{
    int request_time;
    int running_time;
    Job(int request_time,int running_time){
        this.request_time=request_time;
        this.running_time=running_time;
    }
    public int compareTo(Job otherJob){
        return Integer.compare(this.running_time,otherJob.running_time);
    }
}


class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        PriorityQueue<Job>minHeap=new PriorityQueue<>();
        ArrayList<Job>tempJobs=new ArrayList<>();
        for(int i=0;i<jobs.length;i++){
            tempJobs.add(new Job(jobs[i][0],jobs[i][1]));
        }
        Collections.sort(tempJobs,(a,b)->{
            return Integer.compare(a.request_time,b.request_time);
        });//요청시간을 기준으로 Job 배열을 오름차순 정렬한다. 
        
       
        int current_time=0;//현재 시간
        int sum=0;//평균시간을 구하기 위한 합 변수 
        int index=0;
        //시간을 1초씩 증가해가며 현재시간에 Job가 종료되는지와 현재시간 기준 요청된 작업들 중 가장 실행시간이 짧은 작업을 수행한다.
        //매 시간마다 요청되는 작업들을 minHeap에 추가해준다. 
        while(!minHeap.isEmpty()||index<tempJobs.size()){
            while(index<tempJobs.size()&&tempJobs.get(index).request_time<=current_time){
                minHeap.add(tempJobs.get(index));
                index++;
            }
            if(minHeap.isEmpty()){
            current_time=tempJobs.get(index).request_time;
            continue;
            }
            Job job=minHeap.poll();          
            current_time+=job.running_time;
            sum+=current_time-job.request_time;//해당 작업의 종료시간을 요청시간에 빼준다. 
           
        }
        
        return sum/jobs.length;
    }
}