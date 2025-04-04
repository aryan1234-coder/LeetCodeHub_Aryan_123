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
       int max=1;
    public int[] findMode(TreeNode root) {

     

        HashMap<Integer,Integer> ans=new HashMap<>();

        helper(ans,root);
        


        int[] returnAns=new int[ans.size()];
        int temp=0;

        for(Integer key:ans.keySet()){
            if(ans.get(key)==max){

                returnAns[temp++]=key;

            }
           
        }
        return Arrays.copyOf(returnAns, temp);


        
    }
    public void helper(HashMap<Integer,Integer> map,TreeNode root){
        if(root==null){
            return;
        }
        else if(map.containsKey(root.val)){
            int count=map.get(root.val)+1;
            map.put(root.val,count);
            max=Math.max(max,count);
        }
        else{
            map.put(root.val,1);
        }
       
        helper(map,root.left);
        
        helper(map,root.right);

    }
}