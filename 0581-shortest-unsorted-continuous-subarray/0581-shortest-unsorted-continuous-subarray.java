class Solution {
    public int findUnsortedSubarray(int[] nums) {

        int start=-1;
        int end=-1;

        int maxTillNow=nums[0];

        for(int i=1;i<nums.length;i++){

            if(nums[i]>=maxTillNow){
                maxTillNow=nums[i];
            }
            else{
                end=i;
            }
        }
       
       int minTillNow=nums[nums.length-1];

        for(int i=nums.length-2;i>=0;i--){

            if(nums[i]<=minTillNow){
                minTillNow=nums[i];
            }
            else{
                start=i;
            }
        }

        if(start==-1){
            return 0;

        }

        return end-start+1;
        
    }
}