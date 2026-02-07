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
    public TreeNode constructMaximumBinaryTree(int[] nums) {

        
       return buildTree(0,nums.length-1,nums);
        
    }


    public TreeNode buildTree(int i, int j, int[] nums){


        if(i>j){
            return null;
        }

        int maxIndex= findMaximum(i,j,nums);

        TreeNode node= new TreeNode(nums[maxIndex]);
        node.left=buildTree(i,maxIndex-1,nums);
        node.right=buildTree(maxIndex+1,j,nums);

        return node;
        
    }

     public int findMaximum(int l, int m, int[] arr){

        int max=l;


        for(int i=l+1;i<=m;i++){

            if(arr[i]>arr[max]){
                max=i;
            }
        }

        return max;
     }

}