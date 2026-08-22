class Solution {
    public boolean checkDivisibility(int n) {
        int digit=0;
        int sum=0,prod=1;
        int ori=n;
        while(n>0){
            digit=n%10;
            sum+=digit;
            prod*=digit;
            n/=10;
        }
        return ori%(sum+prod)==0;
    }
}