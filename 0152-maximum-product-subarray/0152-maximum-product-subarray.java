class Solution {
    public int maxProduct(int[] nums) {

   int ans=Integer.MIN_VALUE;

   int prefixSum=1;
   int suffixSum=1;

   for(int i=0;i<nums.length;i++){
    

      prefixSum=prefixSum*nums[i];

      suffixSum=suffixSum*nums[nums.length-1-i];

      ans=Math.max(ans, Math.max(prefixSum,suffixSum));

      if(prefixSum==0){
        prefixSum=1;
      }
      if(suffixSum==0){
        suffixSum=1;
      }



   }

    return ans;



        
    }
}