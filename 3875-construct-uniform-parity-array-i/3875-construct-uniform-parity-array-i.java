class Solution {
    public boolean uniformArray(int[] nums1) {
      boolean odd=true;
      for(int num:nums1){
        if(num%2!=0 && (num-1)%2!=0){
            odd=false;
            break;
        }
      }  
      boolean even=true;
      for(int num:nums1){
        if(num%2==0 && (num-1)%2==0){
            even=false;
            break;
        }
      }  
      return odd ||even;
    }
}