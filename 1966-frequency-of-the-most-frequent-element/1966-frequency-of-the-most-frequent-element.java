class Solution {

    //  private int findBest(int targetIdx, int k, int[] nums, long[] prefixSum) {
    //     int target = nums[targetIdx];
        
    //     int i = 0;
    //     int j = targetIdx;
    //     int result = targetIdx;
        
    //     while (i <= j) {
    //         int mid = i + (j - i) / 2;
            
    //         long count = (targetIdx - mid + 1);
    //         long windowSum = (count * target);
    //         long currSum = prefixSum[targetIdx] - prefixSum[mid] + nums[mid];
            
    //         int ops = (int) (windowSum - currSum);
            
    //         if (ops > k) {
    //             i = mid + 1;
    //         } else {
    //             result = mid;
    //             j = mid - 1;
    //         }
    //     }
        
    //     return targetIdx - result + 1;
    // }

    public int maxFrequency(int[] nums, int k) {

        // Arrays.sort(nums);

        // int [] prefixSum=new int[nums.length];
        // prefixSum[0]=nums[0];
        // for(int i=1;i<nums.length;i++){
        //     prefixSum[i]=prefixSum[i-1]+nums[i];
        // }

        // // 1 4 8  13 Prefix Sum
        // // 1 5 13 26

        // int ans=0;

        // for(long i=0;i<nums.length;i++){
        //     ans=Math.max(ans,binarySearch(i,k,nums,prefixSum));
        // }
        // return ans;
        int n = nums.length;
        
        Arrays.sort(nums);
        int i=0;
        int j=0;
        long sum=0;
        long ans=0;
        for(j=0;j<n;j++){
            sum=sum+nums[j];
            while((long)nums[j]*(j-i+1)-sum>k){
                sum=sum-nums[i];
                i++;
            }
            ans=Math.max(ans,j-i+1);
        }
        return (int) ans;
        // long[] prefixSum = new long[n];
        // prefixSum[0] = nums[0];
        
        // for (int i = 1; i < n; i++) {
        //     prefixSum[i] = prefixSum[i - 1] + nums[i];
        // }
        
        // int result = 0;
        
        // for (int i = 0; i < n; i++) {
        //     result = Math.max(result, findBest(i, k, nums, prefixSum));
        // }
        
        // return result;


       


        
    }
}