/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        dfs(root,0,ans);
        return ans;
    }
    private void dfs(TreeNode node,int level,List<List<Integer>> ans){
        if(node==null)
        return;
        if(level==ans.size()){
            ans.add(new ArrayList<>());
        }
        ans.get(level).add(node.val);
        dfs(node.left,level+1,ans);
        dfs(node.right,level+1,ans);
    }
}