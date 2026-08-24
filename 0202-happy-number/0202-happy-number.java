class Solution {
    public boolean isHappy(int n) {
        int slow=n,fast=n;
        do{
            slow=sumOfSq(slow);
            fast=sumOfSq(sumOfSq(fast));
        }while(slow!=fast);
        return slow==1;
    }
    public int sumOfSq(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit*digit;
            n/=10;
        }
        return sum;
    }
}