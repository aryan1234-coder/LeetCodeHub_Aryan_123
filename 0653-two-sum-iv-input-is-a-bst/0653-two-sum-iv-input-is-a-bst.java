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
    public boolean findTarget(TreeNode root, int k) {

       if (root == null || (root.left == null && root.right == null)) {
    return false;
}
        
        ArrayList<Integer> ans=new ArrayList<>();

        

        helper(ans,root);

        

        

        int i=0;
        int j=ans.size()-1;
        while(i<j){

            if(ans.get(i)+ans.get(j)==k){
                return true;

            }
            else if(ans.get(i)+ans.get(j)>k){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
        
    }
      public static void helper(List<Integer> list,TreeNode root){
        if(root==null){
            return;
        }
        helper(list,root.left);
        list.add(root.val);
        helper(list,root.right);

    }
}