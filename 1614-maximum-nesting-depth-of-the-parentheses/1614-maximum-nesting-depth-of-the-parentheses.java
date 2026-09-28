class Solution {
    public int maxDepth(String s) {
        int dep=0,maxDep=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                dep++;
                maxDep=Math.max(dep,maxDep);
            }else if(ch==')'){
                dep--;
            }
        }
        return maxDep;
    }
}