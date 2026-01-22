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
    public boolean isCousins(TreeNode root, int x, int y) {

        TreeNode xx=findNode(root,x);
        TreeNode yy=findNode(root,y);

        return (
            (findLevel(root,xx,0)==findLevel(root,yy,0)) && (!isSibling(root,xx,yy))
        );
        
    }
    public TreeNode findNode(TreeNode root, int value){
        if(root==null){
            return null;
        }
        if(root.val==value){
            return root;
        }
        TreeNode x1=findNode(root.left,value);
        if(x1!=null){
            return x1;
        }
        return findNode(root.right,value);

    }
    public boolean isSibling(TreeNode root,TreeNode node1,TreeNode node2){

        if(root==null){
            return false;
        }
        return(
            (root.left==node1 && root.right==node2) || (root.right==node1 && root.left==node2) 
            || isSibling(root.left,node1,node2) || isSibling(root.right,node1,node2)
        );

    }
    public int findLevel(TreeNode node,TreeNode node1,int level){

        if(node==null){
            return 0;
        }
        if(node==node1){
            return level;
        }
        int l=findLevel(node.left,node1,level+1);
        if(l!=0){
            return l;
        }
        return findLevel(node.right,node1,level+1);

    }

}