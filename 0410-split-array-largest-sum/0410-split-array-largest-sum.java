class Solution {
    public int splitArray(int[] nums, int k) {

        int max=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){

            max=Math.max(nums[i],max);
            sum=sum+nums[i];
        }

        while(max<sum){

            int mid= max+(sum-max)/2;

            int D=1;
            int totalSum=0;

            for(int i=0;i<nums.length;i++){
                
                if((totalSum+nums[i])>mid){
                    D++;
                    totalSum=0;
                }
                totalSum=totalSum+nums[i];

            }

            if(D>k){
                max=mid+1;
            }
            else{
                sum=mid;
            }
        }

        return max;

        
    }
}