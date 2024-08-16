class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
       
       int smallValue=arrays.get(0).get(0);
       int bigValue=arrays.get(0).get(arrays.get(0).size()-1);
       int ans=0;
       for(int i=1;i<arrays.size();i++){
         ans=Math.max(ans,Math.abs(arrays.get(i).get(arrays.get(i).size()-1)-smallValue));
         ans=Math.max(ans,Math.abs(bigValue-arrays.get(i).get(0)));
         smallValue=Math.min(smallValue,arrays.get(i).get(0));
         bigValue=Math.max(bigValue,arrays.get(i).get(arrays.get(i).size()-1));

       }
       return ans;
    }
}