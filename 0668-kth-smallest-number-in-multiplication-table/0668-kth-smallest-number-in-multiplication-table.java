class Solution {
    public int findKthNumber(int m, int n, int k) {


       int low=1;
       int high= m*n;

       while(low<=high){
        int mid= low+ (high-low)/2;

        if(isPossible(mid,m,n,k)){
            high=mid-1;
        }
        else{
            low=mid+1;
        }

       }
       return low;
       
       
        
    }
    public boolean isPossible(int num,int m,int n, int k){

         int countNumber=0;

         for(int i=1;i<=m;i++ ){

             countNumber +=Math.min(num/i,n);
             if(countNumber==0){
                break;
             }
         }

         return countNumber>=k;

    }
}