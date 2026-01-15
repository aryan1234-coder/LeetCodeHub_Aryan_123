class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);

        int prefixSum=0;
        int count=0;
        for(int num: nums){
            prefixSum+=num;
            int remainder=((prefixSum%k)+k)%k;
            count=count+map.getOrDefault(remainder,0);
            map.put(remainder,map.getOrDefault(remainder,0)+1);
        }
        return count;
        
    }
}