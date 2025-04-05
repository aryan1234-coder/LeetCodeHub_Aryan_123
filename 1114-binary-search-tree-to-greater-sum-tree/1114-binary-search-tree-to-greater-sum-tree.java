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
    private   int sum=0;
    public TreeNode bstToGst(TreeNode root) {

        // traverse opposite of Inorder traversal
        backTracking(root);
        return root;


        
    }
    public  void backTracking(TreeNode root){
        if(root==null){
            return ;
        }
        backTracking(root.right);
        sum=sum+root.val;
        root.val=sum;
        backTracking(root.left);

    }
}