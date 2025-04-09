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
    boolean flag=true;

    public boolean isValidBST(TreeNode root) {

        TreeNode[] prev=new TreeNode[1];

        inOrder(root,prev);

        return flag;
        
    }
    public void inOrder(TreeNode root,TreeNode[] prev){
        if(root==null){
            return ;
        }

        inOrder(root.left,prev);
        if(prev[0]!=null){
        if(prev[0].val>=root.val){
            flag= false;
        }
        }
        prev[0]=root;
         inOrder(root.right,prev);

    }
}