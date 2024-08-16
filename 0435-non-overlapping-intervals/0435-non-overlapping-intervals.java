class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
         
         int secondValue=intervals[0][1];
         int ans=0;

         for(int i=1;i<intervals.length;i++){
            if(secondValue>intervals[i][0]){
              ans++;
            }
            else{
                secondValue=intervals[i][1];
            }
         }
         return ans;

        
    }
}