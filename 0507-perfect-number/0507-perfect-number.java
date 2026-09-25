class Solution {
    public boolean checkPerfectNumber(int n) {
        int sum=0;
        for(int i=n-1;i>0;i--){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n)
        return true;
        else
        return false;
    }
}