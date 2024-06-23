import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        //HashMap을 통해서 포켓몬 종류별로 총 몇마리가 있는지 count
        HashMap<Integer,Integer>map=new HashMap<>();
        int totalNum=nums.length;
        for(int i=0;i<totalNum;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        if(map.size()<totalNum/2)return map.size();
        else return totalNum/2;       
    }
}