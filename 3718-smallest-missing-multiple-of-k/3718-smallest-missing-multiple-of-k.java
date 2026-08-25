class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet s=new HashSet<>();
        for(int num:nums){
            s.add(num);
        }
        int mul=k;
        while(true){
            if(!s.contains(mul)){
                return mul;
            }
            mul+=k;
        }
    }
}