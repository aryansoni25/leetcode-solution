class Solution {
    public int matrixSum(int[][] nums) {
        for(int[] row:nums){
            Arrays.sort(row);
        }
        int ans=0;
        int cols=nums[0].length;
        for(int j=0;j<cols;j++){
            int maxV=0;
            for(int[] rows:nums){
                maxV=Math.max(maxV,rows[j]);
            }
            ans+=maxV;
        }
        return ans;
    }
}