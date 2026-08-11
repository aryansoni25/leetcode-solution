class Solution {
    public int missingInteger(int[] nums) {
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                sum+=nums[i];
            }else{
                break;
            }
        }
        boolean[] pre=new boolean[100];
        for(int num:nums){
            pre[num]=true;
        }
        while(sum<100 && pre[sum]){
            sum++;
        }
        return sum;
    }
}