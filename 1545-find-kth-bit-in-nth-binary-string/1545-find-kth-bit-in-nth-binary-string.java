class Solution {
    public char findKthBit(int n, int k) {
        
        if(n==1){
            return '0';
        }

         int totalLength= (1<<n) -1;

         int mid=(totalLength+1)/2;

         if(mid==k){
             return '1';
         }
         else if(k<mid){
            return findKthBit(n-1,k); // this will be same because here we are just getting the binary representation of number

         }
         char c=findKthBit(n-1, totalLength-k+1); // here it will go to starting index where the bit is not changee 
         // because we are doing 
         // mirror index
         // recursive
         // invert result
         return c=='0'? '1': '0';
    }
}