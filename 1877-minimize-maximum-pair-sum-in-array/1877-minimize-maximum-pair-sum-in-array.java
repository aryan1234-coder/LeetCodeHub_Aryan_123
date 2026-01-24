class Solution {
    public int minPairSum(int[] nums) {

        int i=0;
        int j=nums.length-1;

        Arrays.sort(nums);

        int max=Integer.MIN_VALUE;

        while(i<j){

            int ans=nums[i]+nums[j];
            max=Math.max(ans,max);
            i++;
            j--;
        }
        return max;
        
    }
}