class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int l=nums.length;
        int selectNum=l/2;
        boolean[]exist=new boolean[200001];
        int count=0;
        for(int i=0;i<l;i++){
            if(!exist[nums[i]]) {
                count++;
                exist[nums[i]]=true;
            }
        }
        if(selectNum>=count)answer=count;
        else answer=selectNum;
        return answer;
    }
}