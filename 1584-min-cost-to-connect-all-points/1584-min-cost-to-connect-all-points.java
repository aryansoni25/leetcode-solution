class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n=points.length;
        int edgesUsed=0;
        int cost=0;
        boolean[] visited=new boolean[n];
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        pq.add(new int[]{0,0});

        while(edgesUsed<n){
            int[] curr=pq.poll();
            int weight=curr[0],u=curr[1];
            if(visited[u])
            continue;
            visited[u]=true;
            cost+=weight;
            edgesUsed++;
            for(int v=0;v<n;v++){
                if(!visited[v]){
                    int dist = Math.abs(points[u][0] - points[v][0]) +
                               Math.abs(points[u][1] - points[v][1]);
                    pq.add(new int[]{dist, v});
                }
            }
        }
        return cost;
    }
}