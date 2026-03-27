class Solution {
    public int longestPalindromeSubseq(String s) {
        String str="";
     for(int i=s.length()-1;i>=0;i--){
         str=str+s.charAt(i);
     }
        int n=s.length();
        int m=str.length();
         int[][] dp=new int[n+1][m+1];
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         dp[i][j]=-1;
        //     }
        // }
        
      return lcs(s,str,s.length(),str.length(), dp);  
    }
    public int lcs(String text1,String text2,int n,int m,int dp[][]){
       
        
    //     if(n==0 || m==0){
    //         return 0;
    //     }
    //     if(dp[n-1][m-1]!=-1){
    //         return dp[n-1][m-1];
    //     }
    //     if(str1.charAt(n-1)==str2.charAt(m-1)){
    //    dp[n-1][m-1]=1+lcs(str1,str2,n-1,m-1,dp);
    //         return dp[n-1][m-1];
    //     }
    //     else{
    //       dp[n-1][m-1]=  Math.max(lcs(str1,str2,n-1,m,dp),lcs(str1,str2,n,m-1,dp));
    //         return dp[n-1][m-1];
    //     }

     

        for(int i=1;i<text1.length()+1;i++){
            for(int j=1;j<text2.length()+1;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]= Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }
}