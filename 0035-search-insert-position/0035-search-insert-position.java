class Solution {
    public int searchInsert(int[] nums, int target) {

        int i=0;
        int j=nums.length;

        while(i<j){


            int mid=i+(j-i)/2;

            if(nums[mid]>=target){
                j=mid;
            }
            else{
                i=mid+1;
            }
        }
        return i;
        
    }
}