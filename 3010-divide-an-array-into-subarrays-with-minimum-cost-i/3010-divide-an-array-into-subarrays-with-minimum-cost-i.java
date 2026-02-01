class Solution {
    public int minimumCost(int[] nums) {

        int[] newArray=new int[nums.length-1];

        int temp=0;
        for(int i=1;i<nums.length;i++){
            newArray[temp++]=nums[i];
        }

        Arrays.sort(newArray);

        return nums[0]+newArray[0]+newArray[1];
        
    }
}