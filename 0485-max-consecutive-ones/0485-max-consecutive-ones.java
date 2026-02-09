class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int ans=0;
        int count=0;

        for(int i=0;i<nums.length;i++){
             
             if(nums[i]==0){
                count=0;
             }
             else{

                count=count+1;
                ans=Math.max(ans,count);


             }

        }
        return ans;
        
    }
}