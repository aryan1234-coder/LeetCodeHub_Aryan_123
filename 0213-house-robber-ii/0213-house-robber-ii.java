class Solution {
    public int rob(int[] nums) {


        if(nums.length<2){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);

        }

        int[] leftCase=new int[nums.length-1];
        int[] rightCase=new int[nums.length-1];

        for(int i=0;i<nums.length-1;i++){

            leftCase[i]=nums[i+1];
            rightCase[i]=nums[i];
        }

        return Math.max(houseRobber(leftCase,leftCase.length), houseRobber(rightCase,rightCase.length));

        
    }

    public int houseRobber(int[] nums, int n){
        int[] dp=new int[n];


        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);

        for(int i=2;i<n;i++){
            dp[i]=Math.max(dp[i-1], dp[i-2]+nums[i]);
        }
        return dp[n-1];

    }
}