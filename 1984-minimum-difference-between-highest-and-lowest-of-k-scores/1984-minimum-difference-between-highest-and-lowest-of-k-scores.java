class Solution {
    public int minimumDifference(int[] nums, int k) {


        /// find that window of k size and when sort the array and then we can find minimum in that sorted array 
        // by maximum element in k window

        if(k==1){
            return 0;
        }

        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;


        for(int i=0;i<=nums.length-k;i++){
                
                int currentDiff=nums[i+k-1]-nums[i];
                min=Math.min(min,currentDiff);


        }
        return min;


       
        
    }
}