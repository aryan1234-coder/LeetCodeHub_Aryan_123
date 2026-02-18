class Solution {
    public int lastStoneWeight(int[] stones) {

        // make maxHeap
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);

        for(int i=0;i<stones.length;i++){
            pq.add(stones[i]);
        }

        while(pq.size()>1){
            int top1=pq.poll();
            int top2=pq.poll();

            int diff=Math.abs(top1-top2);
            if(diff!=0){
                pq.add(diff);
            }
        }

        if(pq.size()!=0){
            return pq.poll();
        }
        else{
            return 0;
        }




        
    }
}