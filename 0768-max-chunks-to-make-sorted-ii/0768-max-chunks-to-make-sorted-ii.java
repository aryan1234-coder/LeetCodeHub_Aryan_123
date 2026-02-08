class Solution {
    public int maxChunksToSorted(int[] arr) {


        /// What have we seen so far and what should exact in sorted array

        int[] sorted=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            sorted[i]=arr[i];
        }
        Arrays.sort(sorted);
        int ans=0;

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){

            map.put(arr[i],map.getOrDefault(arr[i],0)+1);

            if(map.get(arr[i])==0){
                map.remove(arr[i]);
            }
            
            map.put(sorted[i],map.getOrDefault(sorted[i],0)-1);

            if(map.get(sorted[i])==0){
                map.remove(sorted[i]);
            }

            if(map.isEmpty()){
                ans++;
            }
        }
        return ans;
    }
}