class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {

        int[] ans=new int[queries.length];
        int temp=0;


        for(int i=0;i<queries.length;i++){
            int left=queries[i][0];
            int right=queries[i][1];
            for(int j=left;j<=right;j++){

            ans[temp]^=arr[j];

            }
            temp++;

        }
        return ans;
        
    }
}