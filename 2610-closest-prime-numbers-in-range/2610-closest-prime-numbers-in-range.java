class Solution {
    public int[] closestPrimes(int left, int right) {

        ArrayList<Integer> prime=new ArrayList<>();
       for(int i=left;i<=right;i++){
            if(checkPrime(i)){
                prime.add(i);
            }
        }
        if(prime.size()<2){
                return new int[]{-1,-1};
        }

        int minIndex=0;
        int minValue=Integer.MAX_VALUE;

        for(int i=1;i<prime.size();i++){
            int diff=prime.get(i)-prime.get(i-1);

           if(diff<minValue){
            minValue=diff;
            minIndex=i-1;
           }

        }

        return new int[]{prime.get(minIndex),prime.get(minIndex+1)};
        
       
        
    }
    
    public boolean checkPrime(int n){

        if (n <= 1)
            return false;

        for (int i = 2; i <=Math.sqrt(n); i++)
            if (n % i == 0)
                return false;

        return true;
        
    }
}