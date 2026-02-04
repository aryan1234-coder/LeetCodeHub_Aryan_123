class Solution {
    public boolean isTrionic(int[] nums) {

     if(nums.length<4){
        return false;
     }
     int l=nums.length;
     int i=0;

     while(i+1<l && nums[i]<nums[i+1]){
        i++;
     }

     if(i==0 || i==l-1){
        return false;
     }

     int p=i;
     
     while(i+1<l && nums[i]>nums[i+1]){
        i++;
     }

     if(i==p || i==l-1){
        return false;
     }
     while(i+1<l && nums[i]<nums[i+1]){
        i++;
     }
     return i==l-1;






        
    }
}