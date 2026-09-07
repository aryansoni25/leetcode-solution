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
    private TreeNode current;
    public TreeNode increasingBST(TreeNode root) {
        TreeNode d=new TreeNode(-1);
        current=d;
        inOrder(root);
        return d.right;
    }
    private void inOrder(TreeNode node){
        if(node==null)
        return;
        inOrder(node.left);
        node.left=null;
        current.right=node;
        current=node;
        inOrder(node.right);
    }
}