class Solution {
    public int minRemoval(int[] nums, int k) {


        Arrays.sort(nums);

        int min=0;

        int i=0;
        for(int j=0;j<nums.length;j++){

            
          while((long)nums[j]> (long) nums[i]*k){
            i++;
          }

          min=Math.max(j-i+1,min);

        }

        return nums.length-min;
        
    }
}