class Solution {
    public int change(int amount, int[] coins) {
        int[] d=new int[amount+1];
        d[0]=1;
        for(int coin:coins){
            for(int i=coin;i<=amount;i++){
                d[i]+=d[i-coin];
            }
        }
        return d[amount];
    }
}