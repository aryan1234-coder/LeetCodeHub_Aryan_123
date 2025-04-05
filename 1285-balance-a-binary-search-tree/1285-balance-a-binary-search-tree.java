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
    public TreeNode balanceBST(TreeNode root) {

        ArrayList<Integer> arr=new ArrayList<>();
        inorder(root,arr);
        int i=0;
        int j=arr.size()-1;

        return makeBST(arr,i,j);

        
    }
    public TreeNode makeBST(List<Integer> arr,int start,int end){

        if(start>end){
            return null;
        }

        int mid=start+(end-start)/2;

        TreeNode root=new TreeNode(arr.get(mid));
        root.left=makeBST(arr,start,mid-1);
        root.right=makeBST(arr,mid+1,end);

        return root;
    }

    public void inorder(TreeNode root,List<Integer> arr)
{
    if(root==null){
        return;
    }
    inorder(root.left,arr);
    arr.add(root.val);
    inorder(root.right,arr);




}
}