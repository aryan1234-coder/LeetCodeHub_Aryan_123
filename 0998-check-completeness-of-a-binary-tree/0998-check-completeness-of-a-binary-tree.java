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
    public boolean isCompleteTree(TreeNode root) {

         if(root==null){
            return true;
        }

        Queue<TreeNode> q=new LinkedList<>();

        q.offer(root);
        boolean beforeSeen=false;

        while(!q.isEmpty()){
            TreeNode current=q.poll();

            if(current==null){
                beforeSeen=true;
            }
            else{
                if(beforeSeen){
                    return false;
                }
                q.offer(current.left);
                q.offer(current.right);
            }


        }
        return true;
       
        
    }
}