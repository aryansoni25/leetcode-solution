import java.util.*;
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int maxx=0;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int num:nums){
            h.put(num,h.getOrDefault(num,0)+1);
            maxx=Math.max(maxx,h.getOrDefault(num,0));
        }
        int ans=0;
        for(int count:h.values()){
            if(count==maxx){
                ans+=count;
            }
        }
        return ans;
    }
}