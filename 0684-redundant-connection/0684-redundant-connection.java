class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        ArrayList<Integer>[] a=new ArrayList[n+1];
        for(int i=1;i<=n;i++){
            a[i]=new ArrayList<>();
        }
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            if(hasPath(u,v,a,n)){
                return edge;
            }
            a[u].add(v);
            a[v].add(u);
        }
        return new int[0];
    }
    private boolean hasPath(int src,int target,ArrayList<Integer>[] g,int n){
        Queue<Integer> q=new LinkedList<>();
        boolean[] v=new boolean[n+1];
        q.add(src);
        v[src]=true;
        while(!q.isEmpty()){
            int no=q.remove();
            if(no==target)
            return true;
            for(int neighbor:g[no]){
                if(!v[neighbor]){
                    v[neighbor]=true;
                    q.add(neighbor);
                }
            }
        }
        return false;
    }
}