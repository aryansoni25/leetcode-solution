class Solution {
    public int maxProduct(int[] nums) {
        int max=0,max2=0;
        for(int num:nums){
            if(num>max){
                max2=max;
                max=num;
            }else if(num>max2){
                max2=num;
            }
        }  
        return (max-1)*(max2-1);
            }
}