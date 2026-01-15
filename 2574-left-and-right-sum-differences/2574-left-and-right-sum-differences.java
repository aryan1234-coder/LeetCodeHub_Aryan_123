class Solution {
    public int[] leftRightDifference(int[] nums) {

        int[] leftSum=new int[nums.length];
        leftSum[0]=0;

        for(int i=1;i<nums.length;i++){
            leftSum[i]=leftSum[i-1]+nums[i-1];

        }
         int[] rightSum=new int[nums.length];
        rightSum[nums.length-1]=0;

        for(int j=nums.length-2;j>=0;j--){
            rightSum[j]=rightSum[j+1]+nums[j+1];

        }
        int[] ans=new int[nums.length];
        for(int k=0;k<nums.length;k++){
            ans[k]=Math.abs(rightSum[k]-leftSum[k]);
        }
        return ans;
        
    }
}