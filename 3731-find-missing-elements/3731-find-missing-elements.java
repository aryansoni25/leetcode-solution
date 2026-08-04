import java.util.*;
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       int max=Integer.MIN_VALUE;
       int min=Integer.MAX_VALUE;
       HashSet<Integer> h=new HashSet<>();
       for(int num:nums){
        min=Math.min(num,min);
        max=Math.max(num,max);
        h.add(num);
       } 
       List<Integer> a=new ArrayList<>();
       for(int i=min+1;i<max;i++){
        if(!h.contains(i)){
            a.add(i);
        }
       }
       return a;
    }
}