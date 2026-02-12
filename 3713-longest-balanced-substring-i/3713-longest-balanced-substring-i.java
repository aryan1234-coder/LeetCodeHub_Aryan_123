class Solution {
    public int longestBalanced(String s) {


       
        int ans=0;


       for(int i=0;i<s.length();i++){

         int[] freq=new int[26];
         int maxFreq=0;
         int distinct=0;

        for(int j=i;j<s.length();j++){

        char c=s.charAt(j);
        int index= c-'a';

        if(freq[index]==0){
            distinct++;
        }
        freq[index]=freq[index]+1;
        maxFreq=Math.max(maxFreq,freq[index]);

        if(maxFreq*distinct==j-i+1){
            ans=Math.max(ans,j-i+1);
        }

        }
       }

       return ans;
    }
}