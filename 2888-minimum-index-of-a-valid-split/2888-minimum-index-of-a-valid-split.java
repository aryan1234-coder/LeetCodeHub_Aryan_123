class Solution {
    public int minimumIndex(List<Integer> nums) {

        HashMap<Integer,Integer> map1=new HashMap<>();

        for(int i=0;i<nums.size();i++){

            if(map1.containsKey(nums.get(i))){
                map1.put(nums.get(i),map1.get(nums.get(i))+1);
            }
            else{
                map1.put(nums.get(i),1);
            }
        }

       HashMap<Integer,Integer> map2=new HashMap<>();

        for(int i=0;i<nums.size();i++){

            int num=nums.get(i);

            map1.put(num,map1.get(num)-1);
             map2.put(num, map2.getOrDefault(num, 0) + 1);

             if(map2.get(num) * 2 > i+1 && map1.get(num) * 2 > nums.size()-i-1){
                return i;
             }
        }

        return -1;
        
    }
}