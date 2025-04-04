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
    public int getMinimumDifference(TreeNode root) {

        ArrayList<Integer> ans=new ArrayList<>();

        helper(ans,root);
        int min=Integer.MAX_VALUE;

        for(int i=1;i<ans.size();i++){
            min=Math.min(min,ans.get(i)-ans.get(i-1));
        }

        

        return min;
        
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