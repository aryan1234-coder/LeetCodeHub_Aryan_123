class Solution {
    public int maxProduct(int[] nums) {

        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);

        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }

        int top1=pq.poll();
        int top2=pq.poll();

        return (top1-1) * (top2-1);
        
    }
}