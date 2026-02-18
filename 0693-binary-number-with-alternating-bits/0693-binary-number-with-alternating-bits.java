class Solution {
    public boolean hasAlternatingBits(int n) {

        String ans="";

        while(n>0){

            int t= n%2;
            ans= ans+String.valueOf(t);
            n=n/2;
        }

   
      

       for (int i = 0; i < ans.length() - 1; i++) {
            if (ans.charAt(i) == ans.charAt(i + 1)) {
                return false;
            }
        }

        return true;
        

        
    }
}