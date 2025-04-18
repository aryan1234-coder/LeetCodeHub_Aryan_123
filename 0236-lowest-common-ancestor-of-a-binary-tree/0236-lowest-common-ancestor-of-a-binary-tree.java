/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root==null){
            return null;
        }

        if(root==p || root==q){
            return root;
        }

        TreeNode leftSide=lowestCommonAncestor(root.left, p, q);
        TreeNode rightSide=lowestCommonAncestor(root.right,p,q);

        if(leftSide!=null && rightSide!=null){
            return root;
        }

        if(leftSide!=null){
            return leftSide;
        }
        return rightSide;
        
    }
}