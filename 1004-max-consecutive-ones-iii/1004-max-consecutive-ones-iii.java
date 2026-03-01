class Solution {
    public int longestOnes(int[] nums, int k) {

        int i=0;
        int j=0;
        int count0=0;
        int ans=0;

        while(j<nums.length){

            if(nums[j]==0){
                count0++;
            }

            while(count0>k){

                 if(nums[i]==0){
                     count0--;
                 }
                 i++;
            }

            ans=Math.max(ans,j-i+1);
            j++;

        }

 return ans;
        
    }
}