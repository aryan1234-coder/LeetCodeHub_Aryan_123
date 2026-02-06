class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {

        int[] ans=new int[2];

        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();

        for(int i=0;i<nums1.length;i++){
            map1.put(nums1[i],i);
        }

         for(int j=0;j<nums2.length;j++){
            map2.put(nums2[j],j);
        }
        int count1=0;
        int count2=0;

         for(int k=0;k<nums1.length;k++){
            if(map2.containsKey(nums1[k])){
                count1++;
            }
         }

         for(int l=0;l<nums2.length;l++){
            if(map1.containsKey(nums2[l])){
                count2++;
            }
         }

         ans[0]=count1;
         ans[1]=count2;

         return ans;



        
    }
}