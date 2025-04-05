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

    int totalAns=0;
    public int pathSum(TreeNode root, int targetSum) {

        if(root==null){
            return 0;

        }

        
        HashMap<Long,Integer> map=new HashMap<>();

        map.put(0L,1);

        traversal(root,targetSum,map,0L);

        return totalAns;
        
    }

    public void traversal(TreeNode root,int targetSum,HashMap<Long,Integer> map,long currentSum){

        if(root==null){
            return ;
        }

        currentSum=currentSum+root.val;

        if(map.containsKey(currentSum-targetSum)){
            totalAns=totalAns+map.get(currentSum-targetSum);
        }
        map.put(currentSum,map.getOrDefault(currentSum,0)+1);

        traversal(root.left,targetSum,map,currentSum);
      traversal(root.right,targetSum,map,currentSum);

       // map.put(currentSum,map.get(currentSum)-1);

        if (map.get(currentSum) == 1) {
        map.remove(currentSum);
     } else {
       map.put(currentSum, map.get(currentSum) - 1);
     }
    }
}