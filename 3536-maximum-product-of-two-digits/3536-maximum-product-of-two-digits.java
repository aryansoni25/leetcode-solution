class Solution {
    public int maxProduct(int n) {
        int a=0;
        int b=Integer.MIN_VALUE;
        int digit=0;
        while(n!=0){
            digit=n%10;
            if(digit>=a){
                b=a;
                a=digit;
                
            }else if(digit<a &&digit>b){
                b=digit;
            }
            n/=10;
        }
        return a*b;
    }
}