class Solution {
    public int smallestDistancePair(int[] nums, int k) {

        int max=Arrays.stream(nums).max().getAsInt();
        int [] arr=new int[max+1];

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int distance=Math.abs(nums[i]-nums[j]);
                arr[distance]++;
            }
        }

        for(int k1=0;k1<=max;k1++){
            k=k-arr[k1];
            if(k<=0){
                return k1;
            }
        }
        return -1;
        
        // int n = nums.length;
        // PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        // for(int i = 0; i < n; i++){
        //     for(int j = i + 1; j < n; j++){
        //         q.offer(Math.abs(nums[i] - nums[j]));
        //         if(q.size() > k){
        //             q.poll();
        //         }
        //     }
        // }

        

        // return q.peek();
    }
}