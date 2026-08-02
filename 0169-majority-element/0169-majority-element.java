class Solution {
    public int majorityElement(int[] nums) {
        int a=0;
        int c=0;
        for(int num:nums){
            if(c==0)
            a=num;
            c+=(num==a)?1:-1;
        }
        return a;
    }
}