class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(
        (p1, p2) -> getDistance(p2).compareTo(getDistance(p1)));
        
        for(int i = 0; i < points.length; i++) {
            pq.add(points[i]);
            if(pq.size()>k){
                pq.poll();
            }
        }
        
        int[][] result = new int[k][2];
        int temp=0;
        while(pq.size()>0){
            result[temp++] = pq.poll();
        }
        // for(int i = 0; i < k; i++) {
        //     result[i] = pq.poll();    
        // }
        
        return result;
    }
    
    private Double getDistance(int[] point) {
        return Math.sqrt((point[0] * point[0]) + (point[1] * point[1]));
    }
}