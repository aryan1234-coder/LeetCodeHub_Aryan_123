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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {

        List<TreeNode> ans=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();

        for(int num:to_delete){
            set.add(num);
        }

       

     deleteForest(root,ans,set);

        if(!set.contains(root.val)){
            ans.add(root);
        }

        return ans;
        
    }
    public TreeNode deleteForest(TreeNode root,List<TreeNode> ans,HashSet<Integer> set){
        if(root==null){
            return null;
        }
        root.left=deleteForest(root.left,ans,set);
        root.right=deleteForest(root.right,ans,set);



        if(set.contains(root.val)){
            if(root.left!=null){
                ans.add(root.left);
            }
            if(root.right!=null){
                ans.add(root.right);
            }
            return null;
        }
        else{
            return root;
        }
    }
}