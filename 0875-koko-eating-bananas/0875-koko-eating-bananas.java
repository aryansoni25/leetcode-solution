class Solution {
    public int minEatingSpeed(int[] piles, int ha) {
        int low=1;
        int high=0;
        for(int pile:piles){
            high=Math.max(high,pile);
        }
        while(low<high){
            int mid=low+(high-low)/2;
            long hours=0;
            for(int pile:piles){
                hours+=(mid+pile-1)/mid;
            }
            if(hours<=ha){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}