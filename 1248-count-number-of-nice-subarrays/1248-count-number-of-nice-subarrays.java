class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

    
       int prefixSum=0;
       int ans=0;

       HashMap<Integer,Integer> map=new HashMap<>();
       map.put(0,1);

       for(int i=0;i<nums.length;i++){
            prefixSum=prefixSum+nums[i]%2;

            if(map.containsKey(prefixSum-k)){
                ans=ans+map.get(prefixSum-k);
            }
            else{
                map.put(prefixSum-k,0);
            }

            if(map.containsKey(prefixSum)){
                map.put(prefixSum,map.get(prefixSum)+1);
            }
            else{
                map.put(prefixSum,1);
            }
       }
       return ans;
    }
}