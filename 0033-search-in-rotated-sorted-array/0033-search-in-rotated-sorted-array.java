class Solution {
    public int search(int[] nums, int target) {

        int l=0;
        int r=nums.length-1;
        return helper(nums,target,l,r);

       
        
    }
    public int helper(int[] arr, int target, int l ,int r){


        if(l>r){
            return -1;
        }
        int mid=l+(r-l)/2;

        if(arr[mid]==target){
            return mid;
        }
        if(arr[l]<= arr[mid]){
                 if(target>=arr[l] && target<=arr[mid]){
                  return helper(arr,target,l,mid-1);
                 }
                 else{
                    return helper(arr,target,mid+1,r);
                 }
        }
        if(target>=arr[mid] && target<=arr[r]){
             return helper(arr, target,mid+1,r);
        }
        return helper(arr,target,l,mid-1);

    }
}