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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
     List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }

        Deque<TreeNode> q=new LinkedList<>();
        q.offer(root);

        boolean reverse=false;

        while(!q.isEmpty()){
            int levelsize=q.size();
            List<Integer> list=new ArrayList<>(levelsize);
            for(int i=0;i<levelsize;i++){
                if(!reverse){
                     TreeNode currentNode=q.pollFirst();
                list.add(currentNode.val);
                if(currentNode.left!=null){
                    q.addLast(currentNode.left);
                }
                 if(currentNode.right!=null){
                    q.addLast(currentNode.right);
                }
                }
                else{
                     TreeNode currentNode=q.pollLast();
                list.add(currentNode.val);
                 if(currentNode.right!=null){
                    q.addFirst(currentNode.right);
                }
                if(currentNode.left!=null){
                    q.addFirst(currentNode.left);
                }
                
                }
               
               
            }
             reverse=!reverse;
            ans.add(list);
        }
        return ans;
        
    }
}