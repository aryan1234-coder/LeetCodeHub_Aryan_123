class Solution {

    public boolean canMakeArrayZero(int[] nums,int[][] queries,int mid){

      int n=nums.length;
      int[] clone=nums.clone();
      int[] delta=new int[n+1];

      for(int i=0;i<mid;i++){
         int L=queries[i][0];
         int R=queries[i][1];
         int Valuee=queries[i][2];

         delta[L]=delta[L]-Valuee;

         if(R+1<n){

            delta[R+1]=delta[R+1]+Valuee;

         }

      } 

      int currentValue=0;

      for(int i=0;i<n;i++){
          currentValue += delta[i];
          clone[i] +=currentValue;
           if(clone[i]>0){
            return false;
           }

      }
      return true;

    }
    public int minZeroArray(int[] nums, int[][] queries) {

       int left=0;
       int right=queries.length;
       int ans=-1;


       while(left<=right){

        int mid=left+(right-left)/2;

        if(canMakeArrayZero(nums,queries,mid)){
            ans=mid;
            right=mid-1;
        }
        else{
           left=mid+1;
        } 


       }
       return ans;


        
     }

     
        


        
         




          
        
    
}