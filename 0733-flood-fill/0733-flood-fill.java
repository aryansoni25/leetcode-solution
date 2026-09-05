class Solution {
    private void dfs(int[][] image,int i,int j,int newColor,int org){
         if(i<0 ||j<0 || i>=image.length||j>=image[0].length ||image[i][j]==newColor || image[i][j]!=org){
            return;
        }
        image[i][j]=newColor;
        dfs(image,i-1,j,newColor,org);
        dfs(image,i,j+1,newColor,org);
        dfs(image,i+1,j,newColor,org);
        dfs(image,i,j-1,newColor,org);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
       dfs(image,sr,sc,color,image[sr][sc]);
       return image;
    }
}