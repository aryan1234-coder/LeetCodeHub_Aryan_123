class Solution {
    public int nthUglyNumber(int n) {
       PriorityQueue<Long> pq=new PriorityQueue<Long>();
    
    HashMap<Long,Boolean> map=new HashMap<>();

    pq.add(1L);
    map.put(1L,true);

    long ans=0;

    for(int i=0;i<n;i++){


        ans=pq.poll();
        if(map.containsKey(2*ans)==false){
            pq.add(ans*2);
            map.put(ans*2,true);
        }
        if(map.containsKey(3*ans)==false){
            pq.add(ans*3);
            map.put(ans*3,true);
        }
        if(map.containsKey(5*ans)==false){
            pq.add(ans*5);
            map.put(ans*5,true);
        }
    }
    return (int) ans;

        
    }
}