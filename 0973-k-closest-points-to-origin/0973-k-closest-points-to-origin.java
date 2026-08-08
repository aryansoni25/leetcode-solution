import java.util.*;
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> p = new PriorityQueue<>(
            (a, b) -> (b[0]*b[0] + b[1]*b[1]) - (a[0]*a[0] + a[1]*a[1])
        );
        for(int point[]:points){
            p.offer(point);
            if(p.size()>k)
            p.poll();
        }
        int[][] ans=new int[k][2];
        for(int i=0;i<k;i++){
            ans[i]=p.poll();
        }
        return ans;
    }
}