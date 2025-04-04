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
    public TreeNode searchBST(TreeNode root, int val) {

        Stack<TreeNode> stk=new Stack<>();

        stk.push(root);

        while(!stk.isEmpty()){

            TreeNode node=stk.pop();
              if(node.val==val){
                return node;
              }
              else if(node.val<val && node.right!=null){
                  stk.push(node.right);
              }
              else if(node.val>val && node.left!=null){

                stk.push(node.left);

              }


        }
        return null;
        
    }
}