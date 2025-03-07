class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {

        int i=0;
        int j=0;
        List<int[]> ans=new ArrayList<>();

        while(i<nums1.length && j<nums2.length){
           int i1=nums1[i][0];
            int v1=nums1[i][1];
             int i2=nums2[j][0];
              int v2=nums2[j][1];

              if(i1<i2){
                ans.add(new int[]{i1,v1});
                i++;
              }
              else if(i2<i1){
                ans.add(new int[]{i2,v2});
                j++;
              }
              else{
                ans.add(new int[]{i1,v1+v2});
                i++;
                j++;
              }
        }
        while(i<nums1.length){
            
            ans.add(nums1[i]);
                i++;
        }
         while(j<nums2.length){
            
            ans.add(nums2[j]);
                j++;
        }
        int[][] result = new int[ans.size()][2];
        for (int k = 0; k < ans.size(); k++) {
            result[k] = ans.get(k);
        }
        return result;

        
    }
}