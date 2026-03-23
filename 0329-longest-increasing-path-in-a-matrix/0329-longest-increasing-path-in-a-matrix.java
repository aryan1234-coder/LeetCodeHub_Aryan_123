class Solution {
    public int longestIncreasingPath(int[][] matrix) {


        int[][] dp=new int[matrix.length][matrix[0].length];
        
        int maxAns=0;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){

                int value=recursion(i,j,dp,matrix);
         
              maxAns=Math.max(value,maxAns);

            }
        }

        return maxAns;



        
    }

    public int recursion(int i, int j, int[][]dp, int[][]matrix){

        if(dp[i][j]!=0){
            return dp[i][j];  /// dp ka use isliye kiya taki memoize kiya ja sake agar vo khin phle value aayi hai to kyun bar bar recursion krna direct return kra skte hain
        }
        int ans=1;

        int[][] directions={{0,-1}, {0,1}, {-1,0},{1,0}};

        for(int[] dir: directions){

            int newrowIndex= dir[0]+i;
            int newColumnIndex=dir[1]+j;

            if(  newrowIndex>=0 &&  newrowIndex<matrix.length && newColumnIndex>=0 && 
                newColumnIndex<matrix[0].length && matrix[newrowIndex][newColumnIndex]>matrix[i][j] ){
                    ans=Math.max(ans,1+recursion(newrowIndex,newColumnIndex,dp,matrix));
                }

            
        }

        return dp[i][j]=ans;
    }
}