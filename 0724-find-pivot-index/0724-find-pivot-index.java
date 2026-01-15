class Solution {
    public int pivotIndex(int[] nums) {
        
int sum=0;
for(int i=0;i<nums.length;i++){
    sum=sum+nums[i];
}
int leftTotal=0;
for(int i=0;i<nums.length;i++){

    int rightTotal=sum-leftTotal-nums[i];
    if(leftTotal==rightTotal){
        return i;
    }
    leftTotal=leftTotal+nums[i];


   
}
return -1;
    }
}