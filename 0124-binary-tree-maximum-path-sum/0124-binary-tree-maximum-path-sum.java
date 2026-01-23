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
     int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {

         

           dfs(root);
           return max;

          
        
    }
     public int dfs(TreeNode node){
        if(node==null){
               return 0;
        }
       int left=dfs(node.left);
         int right=dfs(node.right);

         left=Math.max(left,0);
         right=Math.max(right,0);
         int pathSum=left+right+node.val;
         max=Math.max(pathSum,max);

         return Math.max(left,right)+node.val;
        
    }

}
