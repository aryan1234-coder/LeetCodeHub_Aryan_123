class Solution {
    public int superEggDrop(int k, int n) {


        int[][] dp=new int[k+1][n+1];

        for(int i=0;i<k+1;i++){
            for(int j=0;j<n+1;j++){
                dp[i][j]=-1;
            }
        }



        return findThreshHold(k,n,dp);


        
    }
    public int findThreshHold(int k, int n, int[][]dp){
       
       if(n==0 || n==1){
        return n;
       }

        if(k==1){
            return n;
        }

        if(dp[k][n]!=-1){
            return dp[k][n];
        }

        int ans=Integer.MAX_VALUE;
        int left=1;
        int right=n;
        int temp=0;

        while(left<=right){

            int mid=left+(right-left)/2;

            int leftPortion=findThreshHold(k-1,mid-1,dp);
            int rightPortion=findThreshHold(k,n-mid,dp);
            temp=1+Math.max(leftPortion,rightPortion);

            if(leftPortion<rightPortion){

                left=mid+1;


            }
            else{
                right=mid-1;
            }
            


        ans=Math.min(ans,temp);



        }

    dp[k][n]=ans;
    return dp[k][n];

    }
}