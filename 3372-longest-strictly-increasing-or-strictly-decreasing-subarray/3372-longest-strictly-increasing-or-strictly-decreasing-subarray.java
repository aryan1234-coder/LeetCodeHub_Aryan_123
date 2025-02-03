class Solution {
    public int longestMonotonicSubarray(int[] nums) {
if (nums == null || nums.length == 0) return 0;

        int ans = 1, ans2 = 1; 
        int i = 0, i1 = 0;

        for (int j = 1; j < nums.length; j++) {
         
            if (nums[j] > nums[j - 1]) {
                ans = Math.max(ans, j - i + 1);
            } else {
                i = j; 
            }
        }

        for (int j1 = 1; j1 < nums.length; j1++) {
           
            if (nums[j1] < nums[j1 - 1]) {
                ans2 = Math.max(ans2, j1 - i1 + 1);
            } else {
                i1 = j1;
            }
        }

        return Math.max(ans, ans2);
        
    }
}