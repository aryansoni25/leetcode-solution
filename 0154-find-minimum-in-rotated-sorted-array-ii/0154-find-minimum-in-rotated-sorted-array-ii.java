class Solution {
    public int findMin(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int num:nums){
            if(num<min)
            min=num;
        }
        return min;
    }
}