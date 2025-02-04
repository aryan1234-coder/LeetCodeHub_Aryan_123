class Solution {
    public int maxAscendingSum(int[] nums) {
int sum = nums[0]; 
        int ans = sum;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] > nums[j - 1]) {
                sum += nums[j];
            } else {
                ans = Math.max(ans, sum); 
                sum = nums[j]; 
            }
        }
        
        return Math.max(ans, sum); 

        
    }
}