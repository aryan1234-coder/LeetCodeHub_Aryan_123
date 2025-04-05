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
    private int minDiff=Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {

        TreeNode[] prev=new TreeNode[1];
        helper(root,prev);
        return minDiff;

      
        
    }
    private  void helper(TreeNode root,TreeNode[] prev){
        if(root==null){
            return;
        }
        helper(root.left,prev);
        if(prev[0]!=null){
            minDiff=Math.min(minDiff,Math.abs(root.val-prev[0].val));

        }
        prev[0]=root;
        helper(root.right,prev);

    }
}