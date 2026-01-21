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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }

        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int levelsize=q.size();
            List<Integer> list=new ArrayList<>(levelsize);
            for(int i=0;i<levelsize;i++){
                TreeNode currentNode=q.poll();
                list.add(currentNode.val);
                if(currentNode.left!=null){
                    q.offer(currentNode.left);
                }
                 if(currentNode.right!=null){
                    q.offer(currentNode.right);
                }
            }
            ans.add(0,list);
        }
        return ans;
        
    }
}