class Solution {
    public int coinChange(int[] coins, int amount) {

        // int[] dp=new int[amount+1];

        // for(int i=1;i<amount+1;i++){
        //     dp[i]=Integer.MAX_VALUE;
        // }
        // dp[0]=0;

        // for(int i=0;i<coins.length;i++){
        //     for(int j=coins[i];j<=amount;j++){


        //         if(dp[j-coins[i]]!=Integer.MAX_VALUE){

        //             dp[j]=Math.min(dp[j],dp[j-coins[i]]+1);
        //         }
        //     }
        // }
        
        // return dp[amount]==Integer.MAX_VALUE ? -1 : dp[amount];

         int[][] dp=new int[coins.length+1][amount+1];

        for(int i=1;i<coins.length+1;i++){

            dp[i][0]=0;

        }
        for(int j=0;j<amount+1;j++){

            dp[0][j]=Integer.MAX_VALUE-1;
            
        }

         for(int j=1;j<amount+1;j++){

            if(j%coins[0]==0){

                dp[1][j]=j/coins[0];

            }

            else{
                 dp[1][j]=Integer.MAX_VALUE-1;
            }

            
            
        }


        for(int i=2;i<coins.length+1;i++){
            for(int j=1;j<amount+1;j++){

                if(coins[i-1]<=j){
                    dp[i][j]= Math.min(1+dp[i][j-coins[i-1]],dp[i-1][j]);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
  
      return dp[coins.length][amount] == Integer.MAX_VALUE - 1 ? -1 : dp[coins.length][amount];
        
    }
}