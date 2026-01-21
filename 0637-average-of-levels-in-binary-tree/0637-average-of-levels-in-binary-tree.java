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
    public List<Double> averageOfLevels(TreeNode root) {

         List<Double> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }

        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int levelsize=q.size();
            double average=0;
            for(int i=0;i<levelsize;i++){
                TreeNode currentNode=q.poll();
                average+=currentNode.val;
                if(currentNode.left!=null){
                    q.offer(currentNode.left);
                }
                 if(currentNode.right!=null){
                    q.offer(currentNode.right);
                }
            }
            average=average/levelsize;
            ans.add(average);
        }
        return ans;
        
    }
}