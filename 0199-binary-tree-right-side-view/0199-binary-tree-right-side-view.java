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
    public List<Integer> rightSideView(TreeNode root) {
  List<List<Integer>> ans=new ArrayList<>();
  List<Integer> ansreal=new ArrayList<>();

        if(root==null){
            return ansreal;
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
            ans.add(list);
        }
        for(List<Integer> l: ans){
            ansreal.add(l.get(l.size()-1));
        }
        return ansreal;
        
    }
}