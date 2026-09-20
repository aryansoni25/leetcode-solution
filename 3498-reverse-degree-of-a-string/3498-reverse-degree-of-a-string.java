class Solution {
    public int reverseDegree(String s) {
        int n=s.length();
        int res=0;
        for(int i=1;i<=n;i++){
            int rev=26-(s.charAt(i-1)-'a');
            res+=i*rev;
        }
        return res;
    }
}