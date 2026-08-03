class Solution {
    public int rob(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
         return rob(nums,0,m);
    }
    private int rob(int[] nums,int c,Map<Integer,Integer> m){
       if(c>=nums.length)
       return 0;
      if(m.containsKey(c)) return m.get(c);
        int steal=nums[c]+rob(nums,c+2,m);
        int skip=rob(nums,c+1,m);
       int res=Math.max(steal,skip);
       m.put(c,res);
       return res;
       

    }
}