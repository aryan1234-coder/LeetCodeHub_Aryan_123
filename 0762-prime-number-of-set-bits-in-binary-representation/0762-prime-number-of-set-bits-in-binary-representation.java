class Solution {
    public int countPrimeSetBits(int left, int right) {

        int ans=0;

        for(int i=left ; i<=right;i++){

          
          int setBits=Integer.bitCount(i);
            if(isPrime(setBits)){
               ans++;
            }
            
        }
     return ans;

        
    }

    public boolean isPrime(int num){
        
    
        if (num <= 1) {
            return false;
        }
        
     
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false; // Found a divisor, not a prime number
            }
        }
        
        return true; 
    }
}