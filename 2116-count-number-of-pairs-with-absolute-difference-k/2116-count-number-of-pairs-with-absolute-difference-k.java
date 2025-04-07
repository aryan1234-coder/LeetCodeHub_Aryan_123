class Solution {
    public int countKDifference(int[] nums, int k) {

        HashMap<Integer,Integer> map=new HashMap<>();

        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]+k)){
                ans=ans+map.get(nums[i]+k);
            }
             if(map.containsKey(nums[i]-k)){
                ans=ans+map.get(nums[i]-k);
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            
        }
        return ans;
    }
}