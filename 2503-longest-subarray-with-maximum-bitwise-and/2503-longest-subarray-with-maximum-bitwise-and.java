class Solution {
    public int longestSubarray(int[] nums) {

        int max=nums[0];
        int ans=0;
        int ans1=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
        }
        for(int j=0;j<nums.length;j++){
           if(nums[j]==max){
            ans1++;
           }
           else{
            ans1=0;
           }
           ans=Math.max(ans,ans1);
        }

        return ans;
    }
}