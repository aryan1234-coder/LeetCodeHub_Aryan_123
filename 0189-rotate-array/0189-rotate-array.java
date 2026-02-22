class Solution {
    public void rotate(int[] nums, int k) {
         
     k = k % nums.length;

     
      reverse(nums,0,nums.length-k-1);
      reverse(nums,nums.length-k,nums.length-1);
       reverse(nums,0,nums.length-1);


    }
    public void reverse(int[] nums,int a,int b){
        while(a<b){
            int t=nums[a];
            nums[a]=nums[b];
            nums[b]=t;
            a++;
            b--;
        }
    }
}